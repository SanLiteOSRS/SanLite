import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -694186145
	)
	@Export("type")
	final int type;
	@ObfuscatedName("j")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lkk;II)Lhq;",
		garbageValue = "2062718345"
	)
	public static PacketBufferNode method3596(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class21.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		byte var7 = 0;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length());
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length());
			} else if (var6.startsWith("green:")) {
				var7 = 2;
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4;
				var1 = var1.substring("purple:".length());
			} else if (var6.startsWith("white:")) {
				var7 = 5;
				var1 = var1.substring("white:".length());
			} else if (var6.startsWith("flash1:")) {
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length());
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length());
			} else if (var6.startsWith("glow2:")) {
				var7 = 10;
				var1 = var1.substring("glow2:".length());
			} else if (var6.startsWith("glow3:")) {
				var7 = 11;
				var1 = var1.substring("glow3:".length());
			}
		}

		var6 = var1.toLowerCase();
		byte var8 = 0;
		if (var6.startsWith("wave:")) {
			var8 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var8 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var8 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var8 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var8 = 5;
			var1 = var1.substring("slide:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("wave:")) {
				var8 = 1;
				var1 = var1.substring("wave:".length());
			} else if (var6.startsWith("wave2:")) {
				var8 = 2;
				var1 = var1.substring("wave2:".length());
			} else if (var6.startsWith("shake:")) {
				var8 = 3;
				var1 = var1.substring("shake:".length());
			} else if (var6.startsWith("scroll:")) {
				var8 = 4;
				var1 = var1.substring("scroll:".length());
			} else if (var6.startsWith("slide:")) {
				var8 = 5;
				var1 = var1.substring("slide:".length());
			}
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var8);
		ParamComposition.method2878(var4.packetBuffer, var1);
		if (var0 == class254.field3136.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lej;",
		garbageValue = "-24"
	)
	public static VarcInt method3591(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method2656(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-944693216"
	)
	static void method3594() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1411 = null;
		Client.packetWriter.field1412 = null;
		Client.packetWriter.field1400 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1409 = 0;
		Client.rebootTimer = 0;
		class1.method11();
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		class93.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		Skeleton.method3921();
		class12.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field719[var0] = true;
		}

		PacketBufferNode var2 = class21.getPacketBufferNode(ClientPacket.field2662, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(SpotAnimationDefinition.getWindowedMode());
		var2.packetBuffer.writeShort(class32.canvasWidth);
		var2.packetBuffer.writeShort(ReflectionCheck.canvasHeight);
		Client.packetWriter.addNode(var2);
	}
}
