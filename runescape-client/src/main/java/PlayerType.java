import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("PlayerType")
public enum PlayerType implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4225(6, 22, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4212(7, 41, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4213(8, 42, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4214(9, 43, false, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4215(10, 44, false, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4205(11, 45, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4217(12, 46, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4218(13, 47, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4219(14, 48, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4220(15, 49, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	field4211(16, 52, false, false, true);

	@ObfuscatedName("jy")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1134880655
	)
	@Export("id")
	final int id;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1712931507
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("av")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("aq")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 34
		this.modIcon = var4; // L: 35
		this.isPrivileged = var6; // L: 36
		this.isUser = var7; // L: 37
	} // L: 38

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 42
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-291231550"
	)
	static void method6659(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 99
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 100
				int var5 = 0; // L: 101
				if (var1 > var4.maxX * 128) { // L: 102
					var5 += var1 - var4.maxX * 128;
				} else if (var1 < var4.x * 128) { // L: 103
					var5 += var4.x * 128 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 104
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 105
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field817 && WorldMapManager.clientPreferences.method2444() != 0 && var0 == var4.plane) { // L: 106
					var5 -= 64; // L: 117
					if (var5 < 0) { // L: 118
						var5 = 0;
					}

					int var6 = (var4.field817 - var5) * WorldMapManager.clientPreferences.method2444() / var4.field817; // L: 119
					if (var4.stream1 == null) { // L: 120
						if (var4.soundEffectId >= 0) { // L: 121
							SoundEffect var7 = SoundEffect.readSoundEffect(PacketWriter.archive4, var4.soundEffectId, 0); // L: 122
							if (var7 != null) { // L: 123
								RawSound var8 = var7.toRawSound().resample(class19.decimator); // L: 124
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 125
								var9.setNumLoops(-1); // L: 126
								ClanChannelMember.pcmStreamMixer.addSubStream(var9); // L: 127
								var4.stream1 = var9; // L: 128
							}
						}
					} else {
						var4.stream1.method976(var6); // L: 132
					}

					if (var4.stream2 == null) { // L: 133
						if (var4.soundEffectIds != null && (var4.field823 -= var3) <= 0) { // L: 134
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 135
							SoundEffect var12 = SoundEffect.readSoundEffect(PacketWriter.archive4, var4.soundEffectIds[var11], 0); // L: 136
							if (var12 != null) { // L: 137
								RawSound var13 = var12.toRawSound().resample(class19.decimator); // L: 138
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 139
								var10.setNumLoops(0); // L: 140
								ClanChannelMember.pcmStreamMixer.addSubStream(var10); // L: 141
								var4.stream2 = var10; // L: 142
								var4.field823 = var4.field820 + (int)(Math.random() * (double)(var4.field821 - var4.field820)); // L: 143
							}
						}
					} else {
						var4.stream2.method976(var6); // L: 148
						if (!var4.stream2.hasNext()) { // L: 149
							var4.stream2 = null; // L: 150
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 107
						ClanChannelMember.pcmStreamMixer.removeSubStream(var4.stream1); // L: 108
						var4.stream1 = null; // L: 109
					}

					if (var4.stream2 != null) { // L: 111
						ClanChannelMember.pcmStreamMixer.removeSubStream(var4.stream2); // L: 112
						var4.stream2 = null; // L: 113
					}
				}
			}
		}

	} // L: 154
}
