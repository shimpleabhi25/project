package com.springrest.springrest.entities;
import javax.persistence.*;
@Entity
public class loads {
	
		@Id
		private long loadId;
		private  String loadingPoint;
		private String unloadingPoint;
		private String productType;
		private String trucktype;
		private String shipperId;
		private String date;
		private int noOfTrucks,weight;
		private String optional;
		public loads(long loadId,String shipperId, String loadingPoint, String unloadingPoint,String productType, String trucktype, String date,
				int noOfTrucks, int weight, String optional) {
			super();
			this.loadId = loadId;
			this.shipperId=shipperId;
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
		public  long getloadId() {
			return loadId;
		}
		public void setloadId(long loadId) {
			this.loadId = loadId;
		}
		public  String getshipperId() {
			return shipperId;
		}
		public void setshipperId(String shipperId) {
			this.shipperId = shipperId;
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
			return "loads [loadId=" + loadId +",shipperId= "+shipperId+", loadingPoint=" + loadingPoint + ", unloadingPoint="
					+ unloadingPoint + "productType="+productType+", trucktype=" + trucktype + ", date=" + date + ", noOfTrucks=" + noOfTrucks
					+ ", weight=" + weight + ", optional=" + optional + "]";
		}
		
		
}
