import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class131 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static final class131 field1578;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static final class131 field1581;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static final class131 field1575;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static final class131 field1576;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static final class131 field1577;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	static final class131 field1573;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -590541799
	)
	final int field1579;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 987522577
	)
	final int field1580;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -345362565
	)
	final int field1574;

	static {
		field1578 = new class131(0, 0, (String)null, 0); // L: 14
		field1581 = new class131(1, 1, (String)null, 9); // L: 15
		field1575 = new class131(2, 2, (String)null, 3); // L: 16
		field1576 = new class131(3, 3, (String)null, 6); // L: 17
		field1577 = new class131(4, 4, (String)null, 1); // L: 18
		field1573 = new class131(5, 5, (String)null, 3); // L: 19
	}

	class131(int var1, int var2, String var3, int var4) {
		this.field1579 = var1; // L: 29
		this.field1580 = var2; // L: 30
		this.field1574 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1580; // L: 40
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "149385670"
	)
	int method3025() {
		return this.field1574; // L: 35
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "50"
	)
	static void method3031(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 94
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 95
				int var5 = 0; // L: 96
				if (var1 > var4.maxX * 16384) { // L: 97
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) { // L: 98
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 99
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 100
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field861 && class449.clientPreferences.method2554() != 0 && var0 == var4.plane) { // L: 101
					var5 -= 64; // L: 112
					if (var5 < 0) { // L: 113
						var5 = 0;
					}

					int var6 = (var4.field861 - var5) * class449.clientPreferences.method2554() / var4.field861; // L: 114
					if (var4.stream1 == null) { // L: 115
						if (var4.soundEffectId >= 0) { // L: 116
							SoundEffect var7 = SoundEffect.readSoundEffect(KeyHandler.archive9, var4.soundEffectId, 0); // L: 117
							if (var7 != null) { // L: 118
								RawSound var8 = var7.toRawSound().resample(class330.decimator); // L: 119
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 120
								var9.setNumLoops(-1); // L: 121
								class162.pcmStreamMixer.addSubStream(var9); // L: 122
								var4.stream1 = var9; // L: 123
							}
						}
					} else {
						var4.stream1.method907(var6); // L: 127
					}

					if (var4.stream2 == null) { // L: 128
						if (var4.soundEffectIds != null && (var4.field875 -= var3) <= 0) { // L: 129
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 130
							SoundEffect var12 = SoundEffect.readSoundEffect(KeyHandler.archive9, var4.soundEffectIds[var11], 0); // L: 131
							if (var12 != null) { // L: 132
								RawSound var13 = var12.toRawSound().resample(class330.decimator); // L: 133
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 134
								var10.setNumLoops(0); // L: 135
								class162.pcmStreamMixer.addSubStream(var10); // L: 136
								var4.stream2 = var10; // L: 137
								var4.field875 = var4.field867 + (int)(Math.random() * (double)(var4.field865 - var4.field867)); // L: 138
							}
						}
					} else {
						var4.stream2.method907(var6); // L: 143
						if (!var4.stream2.hasNext()) { // L: 144
							var4.stream2 = null; // L: 145
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 102
						class162.pcmStreamMixer.removeSubStream(var4.stream1); // L: 103
						var4.stream1 = null; // L: 104
					}

					if (var4.stream2 != null) { // L: 106
						class162.pcmStreamMixer.removeSubStream(var4.stream2); // L: 107
						var4.stream2 = null; // L: 108
					}
				}
			}
		}

	} // L: 149

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-761761706"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class176.World_worlds != null) { // L: 172
			Occluder.doWorldSorting(0, class176.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-87"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ReflectionCheck.friendsChatManager != null) { // L: 12606
			PacketBufferNode var1 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher); // L: 12607
			var1.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var0)); // L: 12608
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12609
			Client.packetWriter.addNode(var1); // L: 12610
		}
	} // L: 12611
}
