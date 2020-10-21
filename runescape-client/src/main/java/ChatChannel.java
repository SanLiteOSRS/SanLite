import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "Lio;"
	)
	static GameBuild field1334;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -690692767
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "[Lbk;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1674280871
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;",
		garbageValue = "-1425925685"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)Lbk;",
		garbageValue = "50"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "771657019"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Lgk;",
		garbageValue = "-921051133"
	)
	static PacketBufferNode method2363() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BI)Lau;",
		garbageValue = "-2139002337"
	)
	static WorldMapSprite method2375(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class39.convertJpgToSprite(var0).pixels);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lht;I[B[BI)V",
		garbageValue = "1292250703"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2668 == null) {
			if (var2 == null) {
				return;
			}

			var0.field2668 = new byte[11][];
			var0.field2649 = new byte[11][];
			var0.field2670 = new int[11];
			var0.field2671 = new int[11];
		}

		var0.field2668[var1] = var2;
		if (var2 != null) {
			var0.field2667 = true;
		} else {
			var0.field2667 = false;

			for (int var4 = 0; var4 < var0.field2668.length; ++var4) {
				if (var0.field2668[var4] != null) {
					var0.field2667 = true;
					break;
				}
			}
		}

		var0.field2649[var1] = var3;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "70"
	)
	static final void method2381() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var9 = Client.soundEffects[var0];
				if (var9 == null) {
					Object var10000 = null;
					var9 = SoundEffect.readSoundEffect(Username.archive4, Client.soundEffectIds[var0], 0);
					if (var9 == null) {
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays;
					var12[var0] += var9.calculateDelay();
					Client.soundEffects[var0] = var9;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - PlayerType.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - PlayerType.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var2 = (var3 - var8) * Client.areaSoundEffectVolume / var3;
					} else {
						var2 = Client.soundEffectVolume;
					}

					if (var2 > 0) {
						RawSound var10 = var9.toRawSound().resample(NetSocket.decimator);
						RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var2);
						var11.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						GrandExchangeEvents.pcmStreamMixer.addSubStream(var11);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) {
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1];
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1];
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1];
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1];
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
				}

				--var0;
			}
		}

		if (Client.field916 && !class58.method957()) {
			if (Client.musicVolume != 0 && Client.currentTrackGroupId != -1) {
				Canvas.method952(ApproximateRouteStrategy.archive6, Client.currentTrackGroupId, 0, Client.musicVolume, false);
			}

			Client.field916 = false;
		}

	}
}
