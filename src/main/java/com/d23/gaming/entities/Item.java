package com.d23.gaming.entities;

import java.util.List;

public class Item extends AbstractObject{

	protected boolean canPickUp = false;
	protected String actionCommand = null;
	protected String actionResult = null;
	protected String targetCommand = null;
	protected String targetResult = null;
	protected List<Item> containsItems = null;
	
	public boolean isCanPickUp() {
		return canPickUp;
	}
	public void setCanPickUp(boolean canPickUp) {
		this.canPickUp = canPickUp;
	}
	public String getActionCommand() {
		return actionCommand;
	}
	public void setActionCommand(String actionCommand) {
		this.actionCommand = actionCommand;
	}
	public String getActionResult() {
		return actionResult;
	}
	public void setActionResult(String actionResult) {
		this.actionResult = actionResult;
	}
	public String getTargetCommand() {
		return targetCommand;
	}
	public void setTargetCommand(String targetCommand) {
		this.targetCommand = targetCommand;
	}
	public String getTargetResult() {
		return targetResult;
	}
	public void setTargetResult(String targetResult) {
		this.targetResult = targetResult;
	}
	public List<Item> getContainsItems() {
		return containsItems;
	}
	public void setContainsItems(List<Item> containsItems) {
		this.containsItems = containsItems;
	}
	

}
