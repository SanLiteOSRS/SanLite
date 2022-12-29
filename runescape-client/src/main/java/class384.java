import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public final class class384 {
	@ObfuscatedName("h")
	final Comparator field4495;
	@ObfuscatedName("e")
	final Map field4489;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	final class366 field4493;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	final class366 field4491;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 8393668599906735065L
	)
	final long field4492;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	final class382 field4490;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -97881531
	)
	final int field4494;

	@ObfuscatedSignature(
		descriptor = "(JILns;)V"
	)
	class384(long var1, int var3, class382 var4) {
		this.field4495 = new class383(this); // L: 7
		this.field4492 = var1; // L: 34
		this.field4494 = var3; // L: 35
		this.field4490 = var4; // L: 36
		if (this.field4494 == -1) { // L: 37
			this.field4489 = new HashMap(64); // L: 38
			this.field4493 = new class366(64, this.field4495); // L: 39
			this.field4491 = null; // L: 40
		} else {
			if (this.field4490 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4489 = new HashMap(this.field4494); // L: 44
			this.field4493 = new class366(this.field4494, this.field4495); // L: 45
			this.field4491 = new class366(this.field4494); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILns;)V"
	)
	public class384(int var1, class382 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1534234812"
	)
	boolean method7372() {
		return this.field4494 != -1; // L: 51
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-646919436"
	)
	public Object method7386(Object var1) {
		synchronized(this) {
			if (this.field4492 != -1L) {
				this.method7390();
			}

			class385 var3 = (class385)this.field4489.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method7375(var3, false);
				return var3.field4498;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1936546868"
	)
	public Object method7374(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4492 != -1L) {
				this.method7390();
			}

			class385 var4 = (class385)this.field4489.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4498;
				var4.field4498 = var2;
				this.method7375(var4, false);
				return var8;
			} else {
				class385 var5;
				if (this.method7372() && this.field4489.size() == this.field4494) {
					var5 = (class385)this.field4491.remove();
					this.field4489.remove(var5.field4497);
					this.field4493.remove(var5);
				}

				var5 = new class385(var2, var1); // L: 79
				this.field4489.put(var1, var5); // L: 80
				this.method7375(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lnz;ZI)V",
		garbageValue = "377209156"
	)
	void method7375(class385 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4493.remove(var1); // L: 89
			if (this.method7372() && !this.field4491.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4496 = System.currentTimeMillis(); // L: 94
		if (this.method7372()) { // L: 95
			switch(this.field4490.field4482) { // L: 96
			case 0:
				var1.field4499 = var1.field4496; // L: 98
				break;
			case 1:
				++var1.field4499; // L: 101
			}

			this.field4491.add(var1); // L: 104
		}

		this.field4493.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "219225117"
	)
	void method7390() {
		if (this.field4492 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4492; // L: 112

			while (!this.field4493.isEmpty()) { // L: 113
				class385 var3 = (class385)this.field4493.peek(); // L: 114
				if (var3.field4496 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4489.remove(var3.field4497); // L: 116
				this.field4493.remove(var3); // L: 117
				if (this.method7372()) { // L: 118
					this.field4491.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "549271999"
	)
	public void method7387() {
		synchronized(this) { // L: 125
			this.field4489.clear(); // L: 126
			this.field4493.clear(); // L: 127
			if (this.method7372()) { // L: 128
				this.field4491.clear();
			}

		}
	} // L: 130

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-720383995"
	)
	static void method7371() {
		Tiles.field1028 = null; // L: 65
		class490.field5062 = null; // L: 66
		Tiles.field1033 = null; // L: 67
		class358.field4344 = null; // L: 68
		class159.field1816 = null; // L: 69
		Canvas.field136 = null; // L: 70
		Tiles.field1030 = null; // L: 71
		Tiles.Tiles_hue = null; // L: 72
		PcmPlayer.Tiles_saturation = null; // L: 73
		Tiles.Tiles_lightness = null; // L: 74
		NPC.Tiles_hueMultiplier = null; // L: 75
		MenuAction.field905 = null; // L: 76
	} // L: 77

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1932572710"
	)
	public static void method7370(int var0) {
		class286.musicPlayerStatus = 1; // L: 55
		class304.musicTrackArchive = null; // L: 56
		class109.musicTrackGroupId = -1; // L: 57
		class286.musicTrackFileId = -1; // L: 58
		class467.musicTrackVolume = 0; // L: 59
		class145.musicTrackBoolean = false; // L: 60
		class286.pcmSampleLength = var0; // L: 61
	} // L: 62
}
