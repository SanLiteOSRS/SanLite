import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lmn;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 33397835
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1623400787
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1772833165
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1753424576"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "897473801"
	)
	public static String method6049(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 17
			return "";
		} else if (var2 == 1) { // L: 18
			CharSequence var10 = var0[var1]; // L: 19
			return var10 == null ? "null" : var10.toString(); // L: 20 21
		} else {
			int var3 = var2 + var1; // L: 23
			int var4 = 0; // L: 24

			for (int var5 = var1; var5 < var3; ++var5) { // L: 25
				CharSequence var9 = var0[var5]; // L: 26
				if (var9 == null) { // L: 27
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 28
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 30

			for (int var6 = var1; var6 < var3; ++var6) { // L: 31
				CharSequence var7 = var0[var6]; // L: 32
				if (var7 == null) { // L: 33
					var8.append("null");
				} else {
					var8.append(var7); // L: 34
				}
			}

			return var8.toString(); // L: 36
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-179593591"
	)
	static void method6050(boolean var0) {
		byte var1 = 0; // L: 1261
		boolean var2 = class30.clientPreferences.method2539() >= Client.field688; // L: 1264
		if (!var2) { // L: 1266
			var1 = 12; // L: 1267
		} else if (class193.client.method1214() || class193.client.isOtlTokenRequesterInitialized() || class193.client.method1215()) { // L: 1269
			var1 = 10; // L: 1270
		}

		JagexCache.method4224(var1); // L: 1272
		if (var0) { // L: 1273
			Login.Login_username = ""; // L: 1274
			Login.Login_password = ""; // L: 1275
			class36.field247 = 0; // L: 1276
			MenuAction.otp = ""; // L: 1277
		}

		class143.method3203(); // L: 1279
		Message.method1182(); // L: 1280
	} // L: 1281

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-865577578"
	)
	public static class228 method6051() {
		return Client.field792; // L: 1080
	}
}
