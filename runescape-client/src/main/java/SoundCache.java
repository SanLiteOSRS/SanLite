import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	AbstractArchive field323;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	NodeHashTable field321;

	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field321 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field323 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbp;",
		garbageValue = "-799626706"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method826(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field321.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1038();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field321.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lcu;",
		garbageValue = "169233455"
	)
	class53 method822(int var1, int var2) {
		long var3 = this.method826(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field321.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			class53 var6 = new class53(VorbisSample.readMusicSample(this.field323, var1, var2)); // L: 40
			this.field321.put(var6, var3); // L: 41
			return var6; // L: 42
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbp;",
		garbageValue = "-1754927112"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 46
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 47
		} else {
			throw new RuntimeException(); // L: 48
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcu;",
		garbageValue = "8"
	)
	public class53 method824(int var1) {
		if (this.field323.getGroupCount() == 1) { // L: 52
			return this.method822(0, var1); // L: 53
		} else if (this.field323.getGroupFileCount(var1) == 1) { // L: 55
			return this.method822(var1, 0); // L: 56
		} else {
			throw new RuntimeException(); // L: 59
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lbp;",
		garbageValue = "-188177735"
	)
	public RawSound method825(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 64
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "1193583297"
	)
	long method826(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 68
		var4 |= var1 << 16; // L: 69
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 70 71 74
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ldx;ZB)V",
		garbageValue = "-48"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12372
		int var3 = (int)var0.key; // L: 12373
		var0.remove(); // L: 12374
		if (var1) { // L: 12375
			class294.method5664(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) { // L: 12377
			if ((long)var2 == (var4.key >> 48 & 65535L)) { // L: 12378
				var4.remove(); // L: 12379
			}
		}

		Widget var5 = FriendSystem.getWidget(var3); // L: 12383
		if (var5 != null) { // L: 12384
			Messages.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) { // L: 12385
			class453.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12386
}
