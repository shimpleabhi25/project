package com.springrest.springrest.entities;

public class loads {
		private long shiperId;
		private  String loadingPoint,unloadingPoint,productType,trucktype,date;
		private int noOfTrucks,weight;
		private String optional;
		public loads(long shiperId, String loadingPoint, String unloadingPoint,String productType, String trucktype, String date,
				int noOfTrucks, int weight, String optional) {
			super();
			this.shiperId = shiperId;
			this.loadingPoint = loadingPoint;
			this.unloadingPoint = unloadingPoint;
			this.productType=productType;
			this.trucktype = trucktype;
			this.date = date;
			this.noOfTrucks = noOfTrucks;
			this.weight = weight;
			this.optional = optional;
		}
		public loads() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getShiperId() {
			return shiperId;
		}
		public void setShiperId(long shiperId) {
			this.shiperId = shiperId;
		}
		public String getLoadingPoint() {
			return loadingPoint;
		}
		public void setLoadingPoint(String loadingPoint) {
			this.loadingPoint = loadingPoint;
		}
		public String getUnloadingPoint() {
			return unloadingPoint;
		}
		public void setUnloadingPoint(String unloadingPoint) {
			this.unloadingPoint = unloadingPoint;
		}
		public String getproductType() {
			return productType;
		}
		public void setproductType(String productType) {
			this.productType = productType;
		}
		public String getTrucktype() {
			return trucktype;
		}
		public void setTrucktype(String trucktype) {
			this.trucktype = trucktype;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public int getNoOfTrucks() {
			return noOfTrucks;
		}
		public void setNoOfTrucks(int noOfTrucks) {
			this.noOfTrucks = noOfTrucks;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getOptional() {
			return optional;
		}
		public void setOptional(String optional) {
			this.optional = optional;
		}
		@Override
		public String toString() {
			return "loads [shiperId=" + shiperId + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
					+ unloadingPoint + "productType="+productType+", trucktype=" + trucktype + ", date=" + date + ", noOfTrucks=" + noOfTrucks
					+ ", weight=" + weight + ", optional=" + optional + "]";
		}
		
		
}
