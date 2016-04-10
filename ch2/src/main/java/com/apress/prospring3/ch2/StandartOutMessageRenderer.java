package com.apress.prospring3.ch2;

public class StandartOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider = null;
	
	public void render() {
		if(messageProvider == null) {
			throw new RuntimeException("�� ������ ���������� �������� messageProvider ������" +
					StandartOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}
	
	public void setMessageProvider (MessageProvider provider) {
		this.messageProvider = provider;
	}
	
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
