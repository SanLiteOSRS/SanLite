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

@ObfuscatedName("au")
public class class10 {
	@ObfuscatedName("gp")
	static String field37;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 129200615
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("am")
	final HttpsURLConnection field32;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	final class435 field31;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final class9 field36;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	class477 field33;
	@ObfuscatedName("aq")
	boolean field34;
	@ObfuscatedName("ar")
	boolean field35;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -538380081
	)
	int field39;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laa;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this(var1, var2, new class435(), false); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laa;Lqp;Z)V"
	)
	public class10(URL var1, class9 var2, class435 var3, boolean var4) throws IOException {
		this.field34 = false; // L: 17
		this.field35 = false; // L: 18
		this.field39 = 300000; // L: 19
		if (!var2.method64()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method65());
		} else {
			this.field32 = (HttpsURLConnection)var1.openConnection(); // L: 33
			if (!var4) { // L: 34
				this.field32.setSSLSocketFactory(class15.method208()); // L: 35
			}

			this.field36 = var2; // L: 37
			this.field31 = var3 != null ? var3 : new class435(); // L: 38
		}
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laa;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class435(), var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lqp;",
		garbageValue = "1"
	)
	public class435 method88() {
		return this.field31; // L: 42
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I)V",
		garbageValue = "681134776"
	)
	public void method82(class477 var1) {
		if (!this.field34) { // L: 46
			if (var1 == null) { // L: 47
				this.field31.method8075("Content-Type"); // L: 48
				this.field33 = null; // L: 49
			} else {
				this.field33 = var1; // L: 52
				if (this.field33.vmethod8709() != null) { // L: 53
					this.field31.method8078(this.field33.vmethod8709()); // L: 54
				} else {
					this.field31.method8094(); // L: 57
				}

			}
		}
	} // L: 50 59

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-415632703"
	)
	void method80() throws ProtocolException {
		if (!this.field34) { // L: 62
			this.field32.setRequestMethod(this.field36.method65()); // L: 63
			this.field31.method8071(this.field32); // L: 64
			if (this.field36.method63() && this.field33 != null) { // L: 65
				this.field32.setDoOutput(true); // L: 66
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 67

				try {
					var1.write(this.field33.vmethod8715()); // L: 69
					var1.writeTo(this.field32.getOutputStream()); // L: 70
				} catch (IOException var11) { // L: 72
					var11.printStackTrace(); // L: 73
				} finally {
					try {
						var1.close(); // L: 77
					} catch (IOException var10) {
						var10.printStackTrace(); // L: 80
					}

				}
			}

			this.field32.setConnectTimeout(this.field39); // L: 84
			this.field32.setInstanceFollowRedirects(this.field35); // L: 85
			this.field34 = true; // L: 86
		}
	} // L: 87

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-101"
	)
	boolean method84() throws IOException {
		if (!this.field34) { // L: 90
			this.method80();
		}

		this.field32.connect(); // L: 91
		return this.field32.getResponseCode() == -1; // L: 92
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lab;",
		garbageValue = "1394410488"
	)
	class20 method85() {
		try {
			if (!this.field34 || this.field32.getResponseCode() == -1) { // L: 97
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 99
			this.field32.disconnect(); // L: 100
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 101
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field32); // L: 105
			return var1; // L: 113
		} catch (IOException var8) { // L: 107
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field32.disconnect(); // L: 111
		}

		return var3; // L: 108
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "1041258860"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	static void method89() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1343928347"
	)
	static boolean method99() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1474
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1475
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1476
				if (!var0.isLoaded()) { // L: 1477
					return false;
				}

				++Client.archiveLoadersDone; // L: 1478
			}

			return true; // L: 1480
		} else {
			return true; // L: 1479
		}
	}
}
