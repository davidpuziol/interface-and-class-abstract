package model.entities;

import model.enums.Color;

/*
 * Essa classe implementa a interface shape que tem um contrato que e obrigado a implementar o metodo area()
 * Nao e necessario implementar pq e uma classe abstrata, mas quem herdar tera que implementar
*/
public abstract class AbstractShape implements Shape {
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
