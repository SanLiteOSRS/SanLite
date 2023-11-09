import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public final class class381 {
	@ObfuscatedName("a")
	final Comparator field4446;
	@ObfuscatedName("f")
	final Map field4442;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	final class363 field4441;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	final class363 field4443;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -7051518262520903249L
	)
	final long field4444;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	final class379 field4445;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1685085075
	)
	final int field4447;

	@ObfuscatedSignature(
		descriptor = "(JILnw;)V"
	)
	class381(long var1, int var3, class379 var4) {
		this.field4446 = new class380(this); // L: 7
		this.field4444 = var1; // L: 34
		this.field4447 = var3; // L: 35
		this.field4445 = var4; // L: 36
		if (this.field4447 == -1) { // L: 37
			this.field4442 = new HashMap(64); // L: 38
			this.field4441 = new class363(64, this.field4446); // L: 39
			this.field4443 = null; // L: 40
		} else {
			if (this.field4445 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4442 = new HashMap(this.field4447); // L: 44
			this.field4441 = new class363(this.field4447, this.field4446); // L: 45
			this.field4443 = new class363(this.field4447); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILnw;)V"
	)
	public class381(int var1, class379 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1897828923"
	)
	boolean method7214() {
		return this.field4447 != -1; // L: 51
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1414006924"
	)
	public Object method7208(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4444 != -1L) { // L: 56
				this.method7211();
			}

			class382 var3 = (class382)this.field4442.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7215(var3, false); // L: 59
				return var3.field4454; // L: 60
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1114479475"
	)
	public Object method7209(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4444 != -1L) { // L: 66
				this.method7211();
			}

			class382 var4 = (class382)this.field4442.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4454; // L: 69
				var4.field4454 = var2; // L: 70
				this.method7215(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class382 var5;
				if (this.method7214() && this.field4442.size() == this.field4447) { // L: 74
					var5 = (class382)this.field4443.remove(); // L: 75
					this.field4442.remove(var5.field4450); // L: 76
					this.field4441.remove(var5); // L: 77
				}

				var5 = new class382(var2, var1); // L: 79
				this.field4442.put(var1, var5); // L: 80
				this.method7215(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lng;ZI)V",
		garbageValue = "2096861179"
	)
	void method7215(class382 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4441.remove(var1); // L: 89
			if (this.method7214() && !this.field4443.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4451 = System.currentTimeMillis(); // L: 94
		if (this.method7214()) { // L: 95
			switch(this.field4445.field4434) { // L: 96
			case 0:
				var1.field4453 = var1.field4451; // L: 98
				break;
			case 1:
				++var1.field4453; // L: 101
			}

			this.field4443.add(var1); // L: 104
		}

		this.field4441.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1487584922"
	)
	void method7211() {
		if (this.field4444 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4444; // L: 112

			while (!this.field4441.isEmpty()) { // L: 113
				class382 var3 = (class382)this.field4441.peek(); // L: 114
				if (var3.field4451 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4442.remove(var3.field4450); // L: 116
				this.field4441.remove(var3); // L: 117
				if (this.method7214()) { // L: 118
					this.field4443.remove(var3);
				}
			}

		}
	} // L: 122
}
