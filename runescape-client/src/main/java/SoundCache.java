import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bb")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("an")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbe;",
		garbageValue = "-234093775"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null; // L: 23
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) { // L: 28
					var3[0] -= var7.samples.length;
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[IS)Lbe;",
		garbageValue = "17177"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbe;",
		garbageValue = "1998431104"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbe;",
		garbageValue = "731877540"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lne;II)Lsp;",
		garbageValue = "-973248165"
	)
	public static IndexedSprite method855(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1); // L: 132
		boolean var2;
		if (var3 == null) { // L: 133
			var2 = false; // L: 134
		} else {
			class212.SpriteBuffer_decode(var3); // L: 137
			var2 = true; // L: 138
		}

		return !var2 ? null : class353.method6646(); // L: 140 141
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "12"
	)
	static int method852(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1793
			var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1794
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1795
			return 1; // L: 1796
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1798
			var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1799
			if (var3.itemId != -1) { // L: 1800
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1801
			}

			return 1; // L: 1802
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1804
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1805
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1806
			if (var4 != null) { // L: 1807
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1808
			}

			return 1; // L: 1809
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1811
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1812
			return 1; // L: 1813
		} else if (var0 == 2707) { // L: 1815
			var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1816
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6191() ? 1 : 0; // L: 1817
			return 1; // L: 1818
		} else if (var0 == 2708) { // L: 1820
			var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1821
			return World.method1830(var3); // L: 1822
		} else if (var0 == 2709) { // L: 1824
			var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1825
			return class420.method7841(var3); // L: 1826
		} else {
			return 2; // L: 1828
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ldh;B)Z",
		garbageValue = "1"
	)
	static boolean method853(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5017
			return false;
		} else if (BuddyRankComparator.localPlayer != var0) { // L: 5018
			boolean var1 = (Client.drawPlayerNames & 4) != 0; // L: 5021
			boolean var2 = var1; // L: 5023
			if (!var1) { // L: 5024
				boolean var3 = (Client.drawPlayerNames & 1) != 0; // L: 5027
				var2 = var3 && var0.isFriend(); // L: 5029
			}

			return var2 || ItemLayer.method4160() && var0.isFriendsChatMember(); // L: 5031
		} else {
			return IgnoreList.method7455(); // L: 5033
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-12"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ReflectionCheck.friendsChatManager != null) { // L: 11998
			PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.field3089, Client.packetWriter.isaacCipher); // L: 11999
			var1.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var0)); // L: 12000
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12001
			Client.packetWriter.addNode(var1); // L: 12002
		}
	} // L: 12003
}
