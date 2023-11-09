import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class10 {
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("at")
	final HttpsURLConnection field40;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class407 field42;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class9 field41;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	class449 field43;
	@ObfuscatedName("ax")
	boolean field44;
	@ObfuscatedName("ap")
	boolean field45;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1577314221
	)
	int field46;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Lpj;Z)V"
	)
	public class10(URL var1, class9 var2, class407 var3, boolean var4) throws IOException {
		this.field44 = false; // L: 17
		this.field45 = false; // L: 18
		this.field46 = 300000; // L: 19
		if (!var2.method70()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method82()); // L: 27
		} else {
			this.field40 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				this.field40.setSSLSocketFactory(class15.method206()); // L: 31
			}

			this.field41 = var2; // L: 33
			this.field42 = var3 != null ? var3 : new class407(); // L: 34
		}
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class407(), var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lpj;",
		garbageValue = "4"
	)
	public class407 method93() {
		return this.field42; // L: 38
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)V",
		garbageValue = "28"
	)
	public void method91(class449 var1) {
		if (!this.field44) { // L: 42
			if (var1 == null) { // L: 43
				this.field42.method7643("Content-Type"); // L: 44
				this.field43 = null; // L: 45
			} else {
				this.field43 = var1; // L: 48
				if (this.field43.vmethod8254() != null) { // L: 49
					this.field42.method7647(this.field43.vmethod8254()); // L: 50
				} else {
					this.field42.method7645(); // L: 53
				}

			}
		}
	} // L: 46 55

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-2983"
	)
	void method87() throws ProtocolException {
		if (!this.field44) { // L: 58
			this.field40.setRequestMethod(this.field41.method82()); // L: 59
			this.field42.method7640(this.field40); // L: 60
			if (this.field41.method68() && this.field43 != null) { // L: 61
				this.field40.setDoOutput(true); // L: 62
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 63

				try {
					var1.write(this.field43.vmethod8248()); // L: 65
					var1.writeTo(this.field40.getOutputStream()); // L: 66
				} catch (IOException var11) { // L: 68
					var11.printStackTrace(); // L: 69
				} finally {
					try {
						var1.close(); // L: 73
					} catch (IOException var10) { // L: 75
						var10.printStackTrace(); // L: 76
					}

				}
			}

			this.field40.setConnectTimeout(this.field46); // L: 80
			this.field40.setInstanceFollowRedirects(this.field45); // L: 81
			this.field44 = true; // L: 82
		}
	} // L: 83

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2119989742"
	)
	boolean method101() throws IOException {
		if (!this.field44) { // L: 86
			this.method87();
		}

		this.field40.connect(); // L: 87
		return this.field40.getResponseCode() == -1; // L: 88
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Lai;",
		garbageValue = "52"
	)
	class20 method95() {
		try {
			if (!this.field44 || this.field40.getResponseCode() == -1) { // L: 93
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 95
			this.field40.disconnect(); // L: 96
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 97
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field40); // L: 101
			return var1; // L: 109
		} catch (IOException var8) { // L: 103
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field40.disconnect(); // L: 107
		}

		return var3; // L: 104
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	static void method104(int var0) {
		UserComparator9.field1437 = var0; // L: 21
		class438.field4682 = new class438[var0]; // L: 22
		class438.field4684 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)I",
		garbageValue = "46"
	)
	static int method103(Widget var0) {
		if (var0.type != 11) { // L: 1558
			Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize - 1] = ""; // L: 1559
			return 1; // L: 1560
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1562
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var0.method6372(var1); // L: 1563
			return 1; // L: 1564
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-560521371"
	)
	static final void method102(String var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 242
		var2.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 243
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 244
		var2.packetBuffer.method8939(var1); // L: 245
		Client.packetWriter.addNode(var2); // L: 246
	} // L: 247
}
