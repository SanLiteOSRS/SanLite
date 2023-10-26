import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public final class class438 {
	@ObfuscatedName("ac")
	final Comparator field4655;
	@ObfuscatedName("al")
	final Map field4656;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class407 field4657;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class407 field4658;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -532511501764566889L
	)
	final long field4659;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	final class436 field4662;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 893487917
	)
	final int field4660;

	@ObfuscatedSignature(
		descriptor = "(JILqs;)V"
	)
	class438(long var1, int var3, class436 var4) {
		this.field4655 = new class437(this); // L: 7
		this.field4659 = var1; // L: 34
		this.field4660 = var3; // L: 35
		this.field4662 = var4; // L: 36
		if (this.field4660 == -1) { // L: 37
			this.field4656 = new HashMap(64); // L: 38
			this.field4657 = new class407(64, this.field4655); // L: 39
			this.field4658 = null; // L: 40
		} else {
			if (this.field4662 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4656 = new HashMap(this.field4660); // L: 44
			this.field4657 = new class407(this.field4660, this.field4655); // L: 45
			this.field4658 = new class407(this.field4660); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqs;)V"
	)
	public class438(int var1, class436 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	boolean method7927() {
		return this.field4660 != -1; // L: 51
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1480842854"
	)
	public Object method7937(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4659 != -1L) { // L: 56
				this.method7930();
			}

			class439 var3 = (class439)this.field4656.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7941(var3, false); // L: 59
				return var3.field4666; // L: 60
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-496116903"
	)
	public Object method7928(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4659 != -1L) { // L: 66
				this.method7930();
			}

			class439 var4 = (class439)this.field4656.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4666; // L: 69
				var4.field4666 = var2; // L: 70
				this.method7941(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class439 var5;
				if (this.method7927() && this.field4656.size() == this.field4660) { // L: 74
					var5 = (class439)this.field4658.remove(); // L: 75
					this.field4656.remove(var5.field4664); // L: 76
					this.field4657.remove(var5); // L: 77
				}

				var5 = new class439(var2, var1); // L: 79
				this.field4656.put(var1, var5); // L: 80
				this.method7941(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqd;ZI)V",
		garbageValue = "396560222"
	)
	void method7941(class439 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4657.remove(var1); // L: 89
			if (this.method7927() && !this.field4658.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4665 = System.currentTimeMillis(); // L: 94
		if (this.method7927()) { // L: 95
			switch(this.field4662.field4650) { // L: 96
			case 0:
				++var1.field4663; // L: 101
				break;
			case 1:
				var1.field4663 = var1.field4665; // L: 98
			}

			this.field4658.add(var1); // L: 104
		}

		this.field4657.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	void method7930() {
		long var1 = System.currentTimeMillis() - this.field4659; // L: 112

		while (!this.field4657.isEmpty()) { // L: 113
			class439 var3 = (class439)this.field4657.peek(); // L: 114
			if (var3.field4665 >= var1) { // L: 115
				return; // L: 120
			}

			this.field4656.remove(var3.field4664); // L: 116
			this.field4657.remove(var3); // L: 117
			if (this.method7927()) { // L: 118
				this.field4658.remove(var3);
			}
		}

	} // L: 122

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) { // L: 125
			this.field4656.clear(); // L: 126
			this.field4657.clear(); // L: 127
			if (this.method7927()) {
				this.field4658.clear(); // L: 128
			}

		}
	} // L: 130
}
