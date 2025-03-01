package org.eclipse.digitaltwin.basyx.http.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Message
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-24T09:29:02.769762272Z[GMT]")

public class Message {
	@JsonProperty("code")
	private String code = null;

	@JsonProperty("correlationId")
	private String correlationId = null;

	/**
	 * Gets or Sets messageType
	 */
	public enum MessageTypeEnum {
		UNDEFINED("Undefined"),

		INFO("Info"),

		WARNING("Warning"),

		ERROR("Error"),

		EXCEPTION("Exception");

		private String value;

		MessageTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static MessageTypeEnum fromValue(String text) {
			for (MessageTypeEnum b : MessageTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("messageType")
	private MessageTypeEnum messageType = null;

	@JsonProperty("text")
	private String text = null;

	@JsonProperty("timestamp")
	private String timestamp = null;

	public Message code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Get code
	 * 
	 * @return code
	 **/
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Message correlationId(String correlationId) {
		this.correlationId = correlationId;
		return this;
	}

	/**
	 * Get correlationId
	 * 
	 * @return correlationId
	 **/
	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public Message messageType(MessageTypeEnum messageType) {
		this.messageType = messageType;
		return this;
	}

	/**
	 * Get messageType
	 * 
	 * @return messageType
	 **/
	public MessageTypeEnum getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageTypeEnum messageType) {
		this.messageType = messageType;
	}

	public Message text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Get text
	 * 
	 * @return text
	 **/
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Message timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * Get timestamp
	 * 
	 * @return timestamp
	 **/
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Message message = (Message) o;
		return Objects.equals(this.code, message.code) && Objects.equals(this.correlationId, message.correlationId) && Objects.equals(this.messageType, message.messageType) && Objects.equals(this.text, message.text)
				&& Objects.equals(this.timestamp, message.timestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, correlationId, messageType, text, timestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Message {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
		sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
