var app = angular.module('myApp', ['ngRoute']);

app.controller("mainController", function($scope,$http) {

	$scope.reviewObj = {}
	$scope.reviewObj.id = "";
	$scope.reviewObj.brandName = "";
	$scope.reviewObj.comments = "";
	$scope.reviewList;
	
	$scope.getAllRecords = function() {
		$http.get("/getAll").then(function success(response) {
			$scope.reviewList = response.data;

		}, function error(errorResp) {
			console.log('Error ', errorResp);
		});
	}

	$scope.saveReviewForm = function() {
		$http.post("/add", $scope.reviewObj).then(function success(response) {
			console.log(response.data);
			$scope.getAllRecords();
		}, function error(errorResp) {
			console.log('Error ', errorResp);
		});
	}
	$scope.getAllRecords();
})