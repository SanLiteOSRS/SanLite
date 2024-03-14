import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1722320907
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2018972288
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 250555243
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1660861491
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 863217715
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2039856379
	)
	int field872;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -546088405
	)
	int field864;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2049420587
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1620105503
	)
	int field875;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 555083037
	)
	int field877;
	@ObfuscatedName("aj")
	int[] field874;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 126439761
	)
	int field878;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 45
		ObjectComposition var2 = this.obj.transform(); // L: 46
		if (var2 != null) { // L: 47
			this.soundEffectId = var2.ambientSoundId; // L: 48
			this.field872 = var2.int7 * 128; // L: 49
			this.field864 = var2.field2130 * 16384; // L: 50
			this.field875 = var2.int6; // L: 51
			this.field877 = var2.field2155; // L: 52
			this.field874 = var2.soundEffectIds; // L: 53
		} else {
			this.soundEffectId = -1; // L: 56
			this.field872 = 0; // L: 57
			this.field864 = 0; // L: 58
			this.field875 = 0; // L: 59
			this.field877 = 0; // L: 60
			this.field874 = null; // L: 61
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 63
			SceneTilePaint.pcmStreamMixer.removeSubStream(this.stream1); // L: 64
			this.stream1 = null; // L: 65
		}

	} // L: 67

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "78"
	)
	static final boolean method1947(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (WallObject.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class512.field5095; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class512.field5096; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2]; // L: 40
				if (var0 == var3) {
					return true; // L: 41
				}
			}

			return false; // L: 44
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhj;",
		garbageValue = "-688519849"
	)
	static HorizontalAlignment[] method1953() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1951, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1950}; // L: 14
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "20"
	)
	static final boolean method1954(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 115
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 116
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 117
			if (var7 > var0 && var7 > var1 && var7 > var2) { // L: 118
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 119
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 120
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 121
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 122
				}
			}
		}
	}
}
