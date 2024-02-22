import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ak")
public class class10 {
	@ObfuscatedName("ag")
	static String[] field43;
	@ObfuscatedName("aq")
	final HttpsURLConnection field40;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	final class438 field37;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final class9 field38;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	class480 field39;
	@ObfuscatedName("ar")
	boolean field42;
	@ObfuscatedName("as")
	boolean field36;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2069293369
	)
	int field41;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lau;Lqw;Z)V"
	)
	public class10(URL var1, class9 var2, class438 var3, boolean var4) throws IOException {
		this.field42 = false; // L: 17
		this.field36 = false; // L: 18
		this.field41 = 300000; // L: 19
		if (!var2.method63()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method64()); // L: 27
		} else {
			this.field40 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				this.field40.setSSLSocketFactory(class15.method167()); // L: 31
			}

			this.field38 = var2; // L: 33
			this.field37 = var3 != null ? var3 : new class438(); // L: 34
		}
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lau;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class438(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lqw;",
		garbageValue = "1520510651"
	)
	public class438 method85() {
		return this.field37; // L: 38
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsz;I)V",
		garbageValue = "1677115602"
	)
	public void method86(class480 var1) {
		if (!this.field42) { // L: 42
			if (var1 == null) { // L: 43
				this.field37.method8138("Content-Type"); // L: 44
				this.field39 = null; // L: 45
			} else {
				this.field39 = var1; // L: 48
				if (this.field39.vmethod8780() != null) { // L: 49
					this.field37.method8142(this.field39.vmethod8780()); // L: 50
				} else {
					this.field37.method8149(); // L: 53
				}

			}
		}
	} // L: 46 55

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158048326"
	)
	void method87() throws ProtocolException {
		if (!this.field42) { // L: 58
			this.field40.setRequestMethod(this.field38.method64()); // L: 59
			this.field37.method8135(this.field40); // L: 60
			if (this.field38.method68() && this.field39 != null) { // L: 61
				this.field40.setDoOutput(true); // L: 62
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 63

				try {
					var1.write(this.field39.vmethod8781()); // L: 65
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

			this.field40.setConnectTimeout(this.field41); // L: 80
			this.field40.setInstanceFollowRedirects(this.field36); // L: 81
			this.field42 = true; // L: 82
		}
	} // L: 83

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2016978859"
	)
	boolean method92() throws IOException {
		if (!this.field42) { // L: 86
			this.method87();
		}

		this.field40.connect(); // L: 87
		return this.field40.getResponseCode() == -1; // L: 88
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lay;",
		garbageValue = "-128"
	)
	class20 method89() {
		try {
			if (!this.field42 || this.field40.getResponseCode() == -1) { // L: 93
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

	@ObfuscatedName("aw")
	static double method84(double var0, double var2, double var4) {
		return class140.method3167((var0 - var2) / var4) / var4; // L: 13
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-2021156366"
	)
	static final void method88(String var0, int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field3240, Client.packetWriter.isaacCipher); // L: 238
		var2.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 239
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 240
		var2.packetBuffer.method9505(var1); // L: 241
		Client.packetWriter.addNode(var2); // L: 242
	} // L: 243

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "-76"
	)
	static int method98(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4453
			Client.logoutTimer = 250; // L: 4454
			return 1; // L: 4455
		} else {
			return 2; // L: 4457
		}
	}
}
