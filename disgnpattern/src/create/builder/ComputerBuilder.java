package builder;
public class ComputerBuilder{
		Cpu cpu;
		Disk disk;
		Display display;
		MainBoard mainBoard;
		float weight;
		Size size;
		
		public ComputerBuilder setCpu(Cpu cpu) {
			this.cpu = cpu;
			return this;
		}

		public ComputerBuilder setDisk(Disk disk) {
			this.disk = disk;
			return this;
		}

		public ComputerBuilder setDisplay(Display display) {
			this.display = display;
			return this;
		}

		public ComputerBuilder setMainBoard(MainBoard mainBoard) {
			this.mainBoard = mainBoard;
			return this;
		}

		public ComputerBuilder setWeight(float weight) {
			this.weight = weight;
			return this;
		}

		public ComputerBuilder setSize(Size size) {
			this.size = size;
			return this;
		}

		public Computer build(){
			Computer computer = new Computer();
			computer.setCpu(cpu);
			computer.setDisk(disk);
			computer.setDisplay(display);
			computer.setMainBoard(mainBoard);
			computer.setSize(size);
			computer.setWeight(weight);
			return computer;
		}
	}