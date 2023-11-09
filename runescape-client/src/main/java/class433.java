import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
public class class433 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class433 field4671;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class433 field4668;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class433 field4676;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1927704071
	)
	public final int field4670;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 11417249
	)
	public final int field4672;
	@ObfuscatedName("w")
	public final Class field4669;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	public final class429 field4673;

	static {
		field4671 = new class433(1, 0, Integer.class, new class430()); // L: 10
		field4668 = new class433(0, 1, Long.class, new class432());
		field4676 = new class433(2, 2, String.class, new class434());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lpc;)V"
	)
	class433(int var1, int var2, Class var3, class429 var4) {
		this.field4670 = var1; // L: 62
		this.field4672 = var2; // L: 63
		this.field4669 = var3; // L: 64
		this.field4673 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4672; // L: 83
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)Ljava/lang/Object;",
		garbageValue = "1124119473"
	)
	public Object method7602(Buffer var1) {
		return this.field4673.vmethod7608(var1); // L: 87
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljn;Lqx;B)Lji;",
		garbageValue = "0"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) { // L: 35
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 36
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 37
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpy;",
		garbageValue = "-857670044"
	)
	public static class433[] method7604() {
		return new class433[]{field4671, field4668, field4676}; // L: 58
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgr;I)V",
		garbageValue = "2131155181"
	)
	static final void method7605(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 93
			for (var7 = 0; var7 < 64; ++var7) { // L: 94
				for (var8 = 0; var8 < 64; ++var8) { // L: 95
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 96
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					class174.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 104
				}
			}
		}

	} // L: 108

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lpy;",
		garbageValue = "422252256"
	)
	public static class433 method7590(Class var0) {
		class433[] var1 = method7604(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class433 var3 = var1[var2]; // L: 72
			if (var3.field4669 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1268097351"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2937
		class9.method80(); // L: 2938
		Decimator.scene.clear(); // L: 2939

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2940
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2941
		class273.musicPlayerStatus = 1; // L: 2943
		class149.musicTrackArchive = null; // L: 2944
		class273.musicTrackGroupId = -1; // L: 2945
		UserComparator6.musicTrackFileId = -1; // L: 2946
		class273.musicTrackVolume = 0; // L: 2947
		class347.musicTrackBoolean = false; // L: 2948
		FaceNormal.pcmSampleLength = 2; // L: 2949
		Client.currentTrackGroupId = -1; // L: 2951
		Client.playingJingle = false; // L: 2952
		ItemComposition.method3703(); // L: 2953
		class82.updateGameState(10); // L: 2954
	} // L: 2955

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpp;",
		garbageValue = "127"
	)
	static class437 method7606(int var0) {
		class437 var1 = (class437)Client.Widget_cachedModels.get((long)var0); // L: 12462
		if (var1 == null) { // L: 12463
			var1 = new class437(BuddyRankComparator.field1380, SecureRandomCallable.method2126(var0), class13.method174(var0)); // L: 12464
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12465
		}

		return var1; // L: 12467
	}
}
