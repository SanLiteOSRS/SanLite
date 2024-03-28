import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lmh;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1933138891
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1734204845
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 342219291
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1874775072"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1605172721"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110; // L: 27
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIB)V",
		garbageValue = "-93"
	)
	public static void method5921(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3801; // L: 1008
		boolean var4 = var2 != var3.field3686; // L: 1009
		var3.field3686 = var2; // L: 1010
		if (var4) { // L: 1011
			int var5;
			int var7;
			if (var3.field3686 == var1) { // L: 1012
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 1013
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 1014
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 1015
						var3.equipment[var7] = var3.field3695[var7]; // L: 1016
					}
				}
			} else {
				label75: {
					if (var3.equipment[0] >= 512) { // L: 1022
						boolean var8;
						if (var3.equipment[0] < 512) { // L: 1025
							var8 = false; // L: 1030
						} else {
							ItemComposition var6 = class10.ItemComposition_get(var3.equipment[0] - 512); // L: 1026
							var8 = var6.maleModel1 != class225.field2407.field2415 && var6.field2326 != class225.field2407.field2415; // L: 1027
						}

						if (!var8) { // L: 1032
							break label75;
						}
					}

					var3.equipment[class225.field2407.field2415] = 1; // L: 1034
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 1036
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 1037
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 1038
						HitSplatDefinition.method4073(var2, var3.equipment, var5); // L: 1039
					}
				}
			}
		}

		var3.method6332(); // L: 1044
	} // L: 1045

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1114022447"
	)
	static final void method5930() {
		Client.packetWriter.close(); // L: 2936
		class318.method5949(); // L: 2937
		LoginType.scene.clear(); // L: 2938

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2939
			Client.collisionMaps[var0].clear();
		}

		Client.field749.method4282(); // L: 2940
		System.gc(); // L: 2941
		class11.method108(0, 0); // L: 2942
		UserComparator5.method2897(); // L: 2943
		Client.playingJingle = false; // L: 2944
		Canvas.method294(); // L: 2945
		FaceNormal.method4886(10); // L: 2946
		AttackOption.method2678().method3565(); // L: 2947
		AttackOption.method2678().method3561(); // L: 2948
	} // L: 2949
}
