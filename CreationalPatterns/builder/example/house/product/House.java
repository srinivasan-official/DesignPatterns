package builder.example.house.product;

import builder.example.house.components.Garage;
import builder.example.house.components.Garden;
import builder.example.house.components.SwimmingPool;

public class House {
	private int walls;
	private int doors;
	private int windows;
	private int roof;
	private Garage garage;
	private SwimmingPool swimmingPool;
	private Garden garden;
	
	private House(Builder builder) {
		this.walls = builder.getWalls();
		this.doors = builder.getDoors();
		this.windows = builder.getWindows();
		this.roof = builder.getRoof();
		this.garage = builder.getGarage();
		this.swimmingPool = builder.getSwimmingPool();
		this.garden = builder.getGarden();
	}
	
	public int getWalls() {
		return walls;
	}
	
	public void setWalls(int walls) {
		this.walls = walls;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public int getWindows() {
		return windows;
	}
	
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	public int getRoof() {
		return roof;
	}
	
	public void setRoof(int roof) {
		this.roof = roof;
	}
	
	public Garage getGarage() {
		return garage;
	}
	
	public void setGarage(Garage garage) {
		this.garage = garage;
	}
	
	public SwimmingPool getSwimmingPool() {
		return swimmingPool;
	}
	
	public void setSwimmingPool(SwimmingPool swimmingPool) {
		this.swimmingPool = swimmingPool;
	}
	
	public Garden getGarden() {
		return garden;
	}
	
	public void setGarden(Garden garden) {
		this.garden = garden;
	}
	
	public static Builder builder() {
		return new BuilderImpl();
	}
	
	public interface Builder {
		public Builder walls(int walls);
		public Builder doors(int doors);
		public Builder windows(int windows);
		public Builder roof(int roof);
		public Builder garage(Garage garage);
		public Builder swimmingPool(SwimmingPool swimmingPool);
		public Builder garden(Garden garden);
		public int getWalls();
		public int getDoors();
		public int getWindows();
		public int getRoof();
		public Garage getGarage();
		public SwimmingPool getSwimmingPool();
		public Garden getGarden();
		public House build();
	}
	
	private static class BuilderImpl implements Builder {
		private int walls;
		private int doors;
		private int windows;
		private int roof;
		private Garage garage;
		private SwimmingPool swimmingPool;
		private Garden garden;
		
		@Override
		public Builder walls(int walls) {
			this.walls = walls;
			return this;
		}
		
		@Override
		public Builder doors(int doors) {
			this.doors = doors;
			return this;
		}
		
		@Override
		public Builder windows(int windows) {
			this.windows = windows;
			return this;
		}
		
		@Override
		public Builder roof(int roof) {
			this.roof = roof;
			return this;
		}
		
		@Override
		public Builder garage(Garage garage) {
			this.garage = garage;
			return this;
		}
		
		@Override
		public Builder swimmingPool(SwimmingPool swimmingPool) {
			this.swimmingPool = swimmingPool;
			return this;
		}
		
		@Override
		public Builder garden(Garden garden) {
			this.garden = garden;
			return this;
		}
		
		@Override
		public int getWalls() {
			return walls;
		}

		@Override
		public int getDoors() {
			return doors;
		}

		@Override
		public int getWindows() {
			return windows;
		}

		@Override
		public int getRoof() {
			return roof;
		}

		@Override
		public Garage getGarage() {
			return garage;
		}

		@Override
		public SwimmingPool getSwimmingPool() {
			return swimmingPool;
		}

		@Override
		public Garden getGarden() {
			return garden;
		}

		@Override
		public House build() {
			return new House(this);
		}
	}
}
