import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public final class class362 {
	@ObfuscatedName("o")
	final Comparator field4288;
	@ObfuscatedName("q")
	final Map field4283;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	final class348 field4284;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	final class348 field4285;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -7406396989458923739L
	)
	final long field4286;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	final class360 field4282;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1228353645
	)
	final int field4287;

	@ObfuscatedSignature(
		descriptor = "(JILmd;)V"
	)
	class362(long var1, int var3, class360 var4) {
		this.field4288 = new class361(this); // L: 7
		this.field4286 = var1; // L: 34
		this.field4287 = var3; // L: 35
		this.field4282 = var4; // L: 36
		if (this.field4287 == -1) { // L: 37
			this.field4283 = new HashMap(64); // L: 38
			this.field4284 = new class348(64, this.field4288); // L: 39
			this.field4285 = null; // L: 40
		} else {
			if (this.field4282 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4283 = new HashMap(this.field4287); // L: 44
			this.field4284 = new class348(this.field4287, this.field4288); // L: 45
			this.field4285 = new class348(this.field4287); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILmd;)V"
	)
	public class362(int var1, class360 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1040480624"
	)
	boolean method6593() {
		return this.field4287 != -1; // L: 51
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-72"
	)
	public Object method6594(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4286) { // L: 56
				this.method6598();
			}

			class363 var3 = (class363)this.field4283.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method6607(var3, false); // L: 59
				return var3.field4291; // L: 60
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-905107972"
	)
	public Object method6596(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4286 != -1L) { // L: 66
				this.method6598();
			}

			class363 var4 = (class363)this.field4283.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4291; // L: 69
				var4.field4291 = var2; // L: 70
				this.method6607(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class363 var5;
				if (this.method6593() && this.field4283.size() == this.field4287) { // L: 74
					var5 = (class363)this.field4285.remove(); // L: 75
					this.field4283.remove(var5.field4290); // L: 76
					this.field4284.remove(var5); // L: 77
				}

				var5 = new class363(var2, var1); // L: 79
				this.field4283.put(var1, var5); // L: 80
				this.method6607(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmz;ZI)V",
		garbageValue = "1932441348"
	)
	void method6607(class363 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4284.remove(var1); // L: 89
			if (this.method6593() && !this.field4285.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4292 = System.currentTimeMillis(); // L: 94
		if (this.method6593()) { // L: 95
			switch(this.field4282.field4275) { // L: 96
			case 0:
				++var1.field4289; // L: 98
				break;
			case 1:
				var1.field4289 = var1.field4292; // L: 101
			}

			this.field4285.add(var1); // L: 104
		}

		this.field4284.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	void method6598() {
		if (-1L == this.field4286) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4286; // L: 112

			while (!this.field4284.isEmpty()) { // L: 113
				class363 var3 = (class363)this.field4284.peek(); // L: 114
				if (var3.field4292 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4283.remove(var3.field4290); // L: 116
				this.field4284.remove(var3); // L: 117
				if (this.method6593()) { // L: 118
					this.field4285.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1889158363"
	)
	static void method6603(int var0) {
		class387.field4402 = var0; // L: 22
		class387.field4403 = new class387[var0]; // L: 23
		class126.field1537 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "-802220654"
	)
	static SpritePixels method6608() {
		SpritePixels var0 = new SpritePixels(); // L: 162
		var0.width = class457.SpriteBuffer_spriteWidth; // L: 163
		var0.height = class457.SpriteBuffer_spriteHeight; // L: 164
		var0.xOffset = class267.SpriteBuffer_xOffsets[0]; // L: 165
		var0.yOffset = class457.SpriteBuffer_yOffsets[0]; // L: 166
		var0.subWidth = class457.SpriteBuffer_spriteWidths[0]; // L: 167
		var0.subHeight = Decimator.SpriteBuffer_spriteHeights[0]; // L: 168
		int var1 = var0.subHeight * var0.subWidth; // L: 169
		byte[] var2 = class436.SpriteBuffer_pixels[0]; // L: 170
		var0.pixels = new int[var1]; // L: 171

		for (int var3 = 0; var3 < var1; ++var3) { // L: 172
			var0.pixels[var3] = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class267.SpriteBuffer_xOffsets = null; // L: 174
		class457.SpriteBuffer_yOffsets = null; // L: 175
		class457.SpriteBuffer_spriteWidths = null; // L: 176
		Decimator.SpriteBuffer_spriteHeights = null; // L: 177
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null; // L: 178
		class436.SpriteBuffer_pixels = null; // L: 179
		return var0; // L: 181
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9442
			Widget var0 = class293.getWidgetChild(class113.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9443
			if (var0 != null && var0.onTargetLeave != null) { // L: 9444
				ScriptEvent var1 = new ScriptEvent(); // L: 9445
				var1.widget = var0; // L: 9446
				var1.args = var0.onTargetLeave; // L: 9447
				class17.runScriptEvent(var1); // L: 9448
			}

			Client.selectedSpellItemId = -1; // L: 9450
			Client.isSpellSelected = false; // L: 9451
			class220.invalidateWidget(var0); // L: 9452
		}
	} // L: 9453
}
