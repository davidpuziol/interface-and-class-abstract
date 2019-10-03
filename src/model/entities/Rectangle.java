package model.entities;

import model.enums.Color;

/*
 * Essa Classe herda de AbstractShape nesse caso a cor, mas e obrigado a reescrever o metodo area() 
 * Pois a classe AbstractShape tem a obrigacao de implementar o metodo area() da interface Shape
*/

public class Rectangle extends AbstractShape {

	private Double width;
	private Double height;

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
