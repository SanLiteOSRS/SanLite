import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public final class class398 {
	@ObfuscatedName("af")
	final Comparator field4537;
	@ObfuscatedName("an")
	final Map field4536;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	final class377 field4540;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	final class377 field4535;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -5966338096779578459L
	)
	final long field4538;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	final class396 field4539;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1638192103
	)
	final int field4541;

	@ObfuscatedSignature(
		descriptor = "(JILpy;)V"
	)
	class398(long var1, int var3, class396 var4) {
		this.field4537 = new class397(this); // L: 7
		this.field4538 = var1; // L: 34
		this.field4541 = var3; // L: 35
		this.field4539 = var4; // L: 36
		if (this.field4541 == -1) { // L: 37
			this.field4536 = new HashMap(64); // L: 38
			this.field4540 = new class377(64, this.field4537); // L: 39
			this.field4535 = null; // L: 40
		} else {
			if (this.field4539 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4536 = new HashMap(this.field4541); // L: 44
			this.field4540 = new class377(this.field4541, this.field4537); // L: 45
			this.field4535 = new class377(this.field4541); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILpy;)V"
	)
	public class398(int var1, class396 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-119"
	)
	boolean method7697() {
		return this.field4541 != -1; // L: 51
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;S)Ljava/lang/Object;",
		garbageValue = "12054"
	)
	public Object method7718(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4538) { // L: 56
				this.method7702();
			}

			class399 var3 = (class399)this.field4536.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7700(var3, false); // L: 59
				return var3.field4542; // L: 60
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "747668912"
	)
	public Object method7699(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4538 != -1L) { // L: 66
				this.method7702();
			}

			class399 var4 = (class399)this.field4536.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4542; // L: 69
				var4.field4542 = var2; // L: 70
				this.method7700(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class399 var5;
				if (this.method7697() && this.field4536.size() == this.field4541) { // L: 74
					var5 = (class399)this.field4535.remove(); // L: 75
					this.field4536.remove(var5.field4543); // L: 76
					this.field4540.remove(var5); // L: 77
				}

				var5 = new class399(var2, var1); // L: 79
				this.field4536.put(var1, var5); // L: 80
				this.method7700(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpj;ZB)V",
		garbageValue = "-8"
	)
	void method7700(class399 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4540.remove(var1); // L: 89
			if (this.method7697() && !this.field4535.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4544 = System.currentTimeMillis(); // L: 94
		if (this.method7697()) { // L: 95
			switch(this.field4539.field4531) { // L: 96
			case 0:
				++var1.field4545; // L: 101
				break;
			case 1:
				var1.field4545 = var1.field4544; // L: 98
			}

			this.field4535.add(var1); // L: 104
		}

		this.field4540.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method7702() {
		if (this.field4538 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4538; // L: 112

			while (!this.field4540.isEmpty()) { // L: 113
				class399 var3 = (class399)this.field4540.peek(); // L: 114
				if (var3.field4544 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4536.remove(var3.field4543); // L: 116
				this.field4540.remove(var3); // L: 117
				if (this.method7697()) { // L: 118
					this.field4535.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1971799995"
	)
	public void method7719() {
		synchronized(this) { // L: 125
			this.field4536.clear(); // L: 126
			this.field4540.clear(); // L: 127
			if (this.method7697()) {
				this.field4535.clear(); // L: 128
			}

		}
	} // L: 130

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-262861184"
	)
	public static void method7709() {
		class503.SpriteBuffer_xOffsets = null; // L: 261
		class17.SpriteBuffer_yOffsets = null; // L: 262
		class97.SpriteBuffer_spriteWidths = null; // L: 263
		class138.SpriteBuffer_spriteHeights = null; // L: 264
		class394.SpriteBuffer_spritePalette = null; // L: 265
		VarbitComposition.SpriteBuffer_pixels = null; // L: 266
	} // L: 267
}
