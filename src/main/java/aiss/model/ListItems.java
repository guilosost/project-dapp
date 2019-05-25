package aiss.model;

import java.util.List;

public class ListItems<T> {

	private Integer itemsTotales;
	private Integer startIndex;
	private Integer maxItems;
	private List<T> items;

	public ListItems(Integer itemsTotales, List<T> items) {
		this.itemsTotales = itemsTotales;
		this.startIndex = 0;
		this.maxItems = 5;
		this.items = items;
	}

	public ListItems(Integer itemsTotales, Integer startIndex, Integer maxItems, List<T> items) {
		this.itemsTotales = itemsTotales;
		this.startIndex = startIndex;
		this.maxItems = maxItems;
		this.items = items;
	}

	public Integer getItemsTotales() {
		return itemsTotales;
	}

	public void setItemsTotales(Integer itemsTotales) {
		this.itemsTotales = itemsTotales;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getMaxItems() {
		return maxItems;
	}

	public void setMaxItems(Integer maxItems) {
		this.maxItems = maxItems;
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
		result = prime * result + ((maxItems == null) ? 0 : maxItems.hashCode());
		result = prime * result + ((startIndex == null) ? 0 : startIndex.hashCode());
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
		ListItems<T> other = (ListItems<T>) obj;
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
		if (maxItems == null) {
			if (other.maxItems != null)
				return false;
		} else if (!maxItems.equals(other.maxItems))
			return false;
		if (startIndex == null) {
			if (other.startIndex != null)
				return false;
		} else if (!startIndex.equals(other.startIndex))
			return false;
		return true;
	}

}
