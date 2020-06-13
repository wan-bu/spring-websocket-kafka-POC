package ma.intelligentdeed.tutorials.service.dto;

public class PositionDTO {

	private int posX;
	private int posY;

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	@Override
	public String toString() {
		return "PositionDTO [posX=" + posX + ", posY=" + posY + "]";
	}

}
