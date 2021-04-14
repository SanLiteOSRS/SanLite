import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lmg;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lmg;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		signature = "(Lir;Lir;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II[II)Lah;",
		garbageValue = "1896632187"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II[IB)Lah;",
		garbageValue = "-1"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4 ^ 4294967296L;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I[II)Lah;",
		garbageValue = "-1575700242"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I[II)Lah;",
		garbageValue = "1575999128"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "5"
	)
	static int method883(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.field905 : class4.field35;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;B)V",
		garbageValue = "-7"
	)
	static void method889(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, AbstractUserComparator.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != Varcs.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6639(0);
					var8.packetBuffer.method6614(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6658(0);
					var8.packetBuffer.method6771(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6614(var3[var6]);
					var8.packetBuffer.method6606(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6658(0);
					var8.packetBuffer.method6614(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class69.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
