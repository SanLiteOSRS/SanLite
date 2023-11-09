import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public final class class391 {
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "[Lrg;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("f")
	final Comparator field4526;
	@ObfuscatedName("w")
	final Map field4521;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	final class370 field4522;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	final class370 field4520;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -6793249870985350943L
	)
	final long field4523;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	final class389 field4525;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -80049473
	)
	final int field4524;

	@ObfuscatedSignature(
		descriptor = "(JILnr;)V"
	)
	class391(long var1, int var3, class389 var4) {
		this.field4526 = new class390(this); // L: 7
		this.field4523 = var1; // L: 34
		this.field4524 = var3; // L: 35
		this.field4525 = var4; // L: 36
		if (this.field4524 == -1) { // L: 37
			this.field4521 = new HashMap(64); // L: 38
			this.field4522 = new class370(64, this.field4526); // L: 39
			this.field4520 = null; // L: 40
		} else {
			if (this.field4525 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4521 = new HashMap(this.field4524); // L: 44
			this.field4522 = new class370(this.field4524, this.field4526); // L: 45
			this.field4520 = new class370(this.field4524); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILnr;)V"
	)
	public class391(int var1, class389 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-74"
	)
	boolean method7482() {
		return this.field4524 != -1; // L: 51
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-554777055"
	)
	public Object method7483(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4523) { // L: 56
				this.method7486();
			}

			class392 var3 = (class392)this.field4521.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7485(var3, false); // L: 59
				return var3.field4531; // L: 60
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-2094667345"
	)
	public Object method7484(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4523 != -1L) { // L: 66
				this.method7486();
			}

			class392 var4 = (class392)this.field4521.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4531; // L: 69
				var4.field4531 = var2; // L: 70
				this.method7485(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class392 var5;
				if (this.method7482() && this.field4521.size() == this.field4524) { // L: 74
					var5 = (class392)this.field4520.remove(); // L: 75
					this.field4521.remove(var5.field4529); // L: 76
					this.field4522.remove(var5); // L: 77
				}

				var5 = new class392(var2, var1); // L: 79
				this.field4521.put(var1, var5); // L: 80
				this.method7485(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Loh;ZI)V",
		garbageValue = "1998527527"
	)
	void method7485(class392 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4522.remove(var1); // L: 89
			if (this.method7482() && !this.field4520.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4530 = System.currentTimeMillis(); // L: 94
		if (this.method7482()) { // L: 95
			switch(this.field4525.field4514) { // L: 96
			case 0:
				var1.field4528 = var1.field4530; // L: 101
				break;
			case 1:
				++var1.field4528; // L: 98
			}

			this.field4520.add(var1); // L: 104
		}

		this.field4522.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-95573050"
	)
	void method7486() {
		if (this.field4523 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4523; // L: 112

			while (!this.field4522.isEmpty()) { // L: 113
				class392 var3 = (class392)this.field4522.peek(); // L: 114
				if (var3.field4530 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4521.remove(var3.field4529); // L: 116
				this.field4522.remove(var3); // L: 117
				if (this.method7482()) { // L: 118
					this.field4520.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	public void method7487() {
		synchronized(this) { // L: 125
			this.field4521.clear(); // L: 126
			this.field4522.clear(); // L: 127
			if (this.method7482()) {
				this.field4520.clear(); // L: 128
			}

		}
	} // L: 130
}
