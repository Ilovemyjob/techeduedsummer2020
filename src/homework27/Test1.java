package homework27;

public class Test1 {
	
	private double width;

	private double height;

	private double screenSize;

	private int maxVolume;

	private int volume = 12;

	private boolean power;



	public Test1(double width, double height, double screenSize) {

		this.width = width;

		this.height = height;

		this.screenSize = screenSize;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

			
	}
			public double channelTuning(int channel) {

				switch (channel) {

				case 1:

					return 34.56;

				case 2:

					return 54.89;

				case 3:

					return 73.89;

				case 4:

					return 94.98;

				}

				return 0;

			}

			public int decreaseVolume() {

				if (0 < volume) {

					volume--;

				}

				return volume;

			}

			public void powerSwitch() {

				this.power = !power;

			}

			public int increaseVolume() {

				if (maxVolume > volume)

					volume++;

				return volume;

			}

		
	
}