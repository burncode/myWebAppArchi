var showSidebar = false;

// 初始化导航栏和侧边栏
function initNavigation() {
	var app = angular.module("myApp", []);
	app.controller("myCtrl", function($scope, $http) {
		// 从后台获取导航栏列表
		$http.get(href + "/api/v1/websitemap").then(function(response) {
			var navigation = [];
			var channels = response.data.channels;
			for (i = 0; i < channels.length; i++) {
				navigation[i] = channels[i].channelName;
			}
			$scope.navigationList = navigation;
		});

		// 点击导航栏的频道，重置content内容，打开侧边栏，
		$scope.navigate = function() {
			// 重置sidebar内容
			var selectedItem = $scope.navigationList[this.$index];
			$http.get(href + "/api/v1/websitemap").then(function(response) {
				var sidebar = [];
				var channel;
				for (i = 0; i < response.data.channels.length; i++) {
					var cn = response.data.channels[i].channelName;
					if (selectedItem == cn) {
						channel = response.data.channels[i];
						break;
					}
				}
				if (channel.subMenu == null || channel.subMenu.length == 0) {
					$scope.sidebarList = [];
					$("#myPageContent").css("marginLeft", "0%");
					$("#mySidebar").css("width", "10%");
					$("#mySidebar").css("display", "none");
					showSidebar = false;
					// 重置content内容
					$('iframe').attr('src', href + "getPage?pageName="+channel.channelName);
				}else{
					for (i = 0; i < channel.subMenu.length; i++){
						sidebar[i] = channel.subMenu[i];
					}
					$scope.sidebarList = sidebar;
					// 重置content内容
					$('iframe').attr('src', href + "getPage?pageName="+channel.subMenu[0]);
				}
				
				
			});

			// 打开侧边栏
			$("#myPageContent").css("marginLeft", "10%");
			$("#mySidebar").css("width", "10%");
			$("#mySidebar").css("display", "block");
			showSidebar = true;
		};
		
		//点击侧边栏，重置content内容
		$scope.sidebarAction = function(){
			var selectedItem = $scope.sidebarList[this.$index];
			$('iframe').attr('src', href + "getPage?pageName="+selectedItem);
		};
		
	});

	// 点击侧边栏按钮，显示/隐藏侧边栏
	$("#sidebarBtn").click(function() {
		if (showSidebar == false) {
			$("#myPageContent").css("marginLeft", "10%");
			$("#mySidebar").css("width", "10%");
			$("#mySidebar").css("display", "block");
			showSidebar = true;
		} else {
			$("#myPageContent").css("marginLeft", "0%");
			$("#mySidebar").css("width", "10%");
			$("#mySidebar").css("display", "none");
			showSidebar = false;
		}
	});
}
