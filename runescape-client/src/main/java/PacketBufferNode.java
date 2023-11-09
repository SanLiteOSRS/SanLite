import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lkp;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -367873173
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1667084847
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 997120047
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-957261976"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 61
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 62
		}
	} // L: 63

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1565722343"
	)
	public static String method5467(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 151
		int var2 = 0; // L: 152
		int var3 = -1; // L: 153

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 154
			char var5 = var0.charAt(var4); // L: 155
			if (var5 == '<') { // L: 156
				var1.append(var0.substring(var2, var4)); // L: 157
				var3 = var4; // L: 158
			} else if (var5 == '>' && var3 != -1) { // L: 161
				String var6 = var0.substring(var3 + 1, var4); // L: 162
				var3 = -1; // L: 163
				if (var6.equals("lt")) { // L: 164
					var1.append("<"); // L: 165
				} else if (var6.equals("gt")) { // L: 167
					var1.append(">"); // L: 168
				} else if (var6.equals("br")) { // L: 170
					var1.append("\n"); // L: 171
				}

				var2 = var4 + 1; // L: 173
			}
		}

		if (var2 < var0.length()) { // L: 176
			var1.append(var0.substring(var2, var0.length())); // L: 177
		}

		return var1.toString(); // L: 179
	}
}
