package aiss.model;

import java.util.List;

public class ListItems<T> {

	private Integer itemsTotales;
	private Integer offset; // Número de índice inicial
	private Integer limit; // Límite de items por página
	private List<T> items;

	public ListItems(Integer itemsTotales, List<T> items) {
		this.itemsTotales = itemsTotales;
		this.offset = 0;
		this.limit = items.size();
		this.items = items;
	}

	public ListItems(Integer itemsTotales, Integer offset, Integer limit, List<T> items) {
		this.itemsTotales = itemsTotales;
		this.offset = offset;
		this.limit = limit;
		this.items = items;
	}

	public Integer getItemsTotales() {
		return itemsTotales;
	}

	public void setItemsTotales(Integer itemsTotales) {
		this.itemsTotales = itemsTotales;
	}

	public Integer getStartIndex() {
		return offset;
	}

	public void setStartIndex(Integer startIndex) {
		this.offset = startIndex;
	}

	public Integer getMaxItems() {
		return limit;
	}

	public void setMaxItems(Integer maxItems) {
		this.limit = maxItems;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((itemsTotales == null) ? 0 : itemsTotales.hashCode());
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListItems<?> other = (ListItems<?>) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (itemsTotales == null) {
			if (other.itemsTotales != null)
				return false;
		} else if (!itemsTotales.equals(other.itemsTotales))
			return false;
		if (limit == null) {
			if (other.limit != null)
				return false;
		} else if (!limit.equals(other.limit))
			return false;
		if (offset == null) {
			if (other.offset != null)
				return false;
		} else if (!offset.equals(other.offset))
			return false;
		return true;
	}

}
