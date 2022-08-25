import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public enum class6 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	field19(0, 0);

	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1989990503
	)
	final int field20;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1806793245
	)
	final int field23;

	class6(int var3, int var4) {
		this.field20 = var3; // L: 16
		this.field23 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field23; // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "96365567"
	)
	static void method42(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 99
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 100
				int var5 = 0; // L: 101
				if (var1 > var4.maxX * 16384) { // L: 102
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 128) { // L: 103
					var5 += var4.x * 128 - var1;
				}

				if (var2 > var4.maxY * 128) { // L: 104
					var5 += var2 - var4.maxY * 128;
				} else if (var2 < var4.y * 16384) { // L: 105
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field812 && FriendsChatMember.clientPreferences.method2226() != 0 && var0 == var4.plane) { // L: 106
					var5 -= 64; // L: 117
					if (var5 < 0) { // L: 118
						var5 = 0;
					}

					int var6 = (var4.field812 - var5) * FriendsChatMember.clientPreferences.method2226() / var4.field812; // L: 119
					if (var4.stream1 == null) { // L: 120
						if (var4.soundEffectId >= 0) { // L: 121
							SoundEffect var7 = SoundEffect.readSoundEffect(class271.archive4, var4.soundEffectId, 0); // L: 122
							if (var7 != null) { // L: 123
								RawSound var8 = var7.toRawSound().resample(ScriptEvent.decimator); // L: 124
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 125
								var9.setNumLoops(-1); // L: 126
								ModeWhere.pcmStreamMixer.addSubStream(var9); // L: 127
								var4.stream1 = var9; // L: 128
							}
						}
					} else {
						var4.stream1.method836(var6); // L: 132
					}

					if (var4.stream2 == null) { // L: 133
						if (var4.soundEffectIds != null && (var4.field815 -= var3) <= 0) { // L: 134
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 135
							SoundEffect var12 = SoundEffect.readSoundEffect(class271.archive4, var4.soundEffectIds[var11], 0); // L: 136
							if (var12 != null) { // L: 137
								RawSound var13 = var12.toRawSound().resample(ScriptEvent.decimator); // L: 138
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 139
								var10.setNumLoops(0); // L: 140
								ModeWhere.pcmStreamMixer.addSubStream(var10); // L: 141
								var4.stream2 = var10; // L: 142
								var4.field815 = var4.field807 + (int)(Math.random() * (double)(var4.field811 - var4.field807)); // L: 143
							}
						}
					} else {
						var4.stream2.method836(var6); // L: 148
						if (!var4.stream2.hasNext()) { // L: 149
							var4.stream2 = null; // L: 150
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 107
						ModeWhere.pcmStreamMixer.removeSubStream(var4.stream1); // L: 108
						var4.stream1 = null; // L: 109
					}

					if (var4.stream2 != null) { // L: 111
						ModeWhere.pcmStreamMixer.removeSubStream(var4.stream2); // L: 112
						var4.stream2 = null; // L: 113
					}
				}
			}
		}

	} // L: 154

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-25"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!AbstractByteArrayCopier.client.method1086() && !AbstractByteArrayCopier.client.isOtlTokenRequesterInitialized()) { // L: 1145
			Login.Login_response1 = ""; // L: 1149
			Login.Login_response2 = "Enter your username/email & password."; // L: 1150
			Login.Login_response3 = ""; // L: 1151
			class116.method2683(2); // L: 1152
			if (var0) { // L: 1153
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1155
				if (FriendsChatMember.clientPreferences.method2227() != null) { // L: 1156
					Login.Login_username = FriendsChatMember.clientPreferences.method2227(); // L: 1157
					Client.Login_isUsernameRemembered = true; // L: 1158
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1160
				}
			}

			ReflectionCheck.method580(); // L: 1162
		} else {
			class116.method2683(10); // L: 1146
		}
	} // L: 1147 1163

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "48"
	)
	static final void method45(boolean var0) {
		class83.playPcmPlayers(); // L: 5629
		++Client.packetWriter.pendingWrites; // L: 5630
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5631
			Client.packetWriter.pendingWrites = 0; // L: 5632
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5633
				PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2966, Client.packetWriter.isaacCipher); // L: 5635
				Client.packetWriter.addNode(var1); // L: 5636

				try {
					Client.packetWriter.flush(); // L: 5638
				} catch (IOException var3) { // L: 5640
					Client.hadNetworkError = true; // L: 5641
				}
			}

		}
	} // L: 5644
}
