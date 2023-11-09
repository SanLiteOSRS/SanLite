import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public final class class394 {
	@ObfuscatedName("aj")
	final Comparator field4487;
	@ObfuscatedName("al")
	final Map field4484;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	final class373 field4483;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	final class373 field4481;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -7338482294239229465L
	)
	final long field4482;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	final class392 field4486;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1557215357
	)
	final int field4485;

	@ObfuscatedSignature(
		descriptor = "(JILpm;)V"
	)
	class394(long var1, int var3, class392 var4) {
		this.field4487 = new class393(this); // L: 7
		this.field4482 = var1; // L: 34
		this.field4485 = var3; // L: 35
		this.field4486 = var4; // L: 36
		if (this.field4485 == -1) { // L: 37
			this.field4484 = new HashMap(64); // L: 38
			this.field4483 = new class373(64, this.field4487); // L: 39
			this.field4481 = null; // L: 40
		} else {
			if (this.field4486 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4484 = new HashMap(this.field4485); // L: 44
			this.field4483 = new class373(this.field4485, this.field4487); // L: 45
			this.field4481 = new class373(this.field4485); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILpm;)V"
	)
	public class394(int var1, class392 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-121"
	)
	boolean method7421() {
		return this.field4485 != -1; // L: 51
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-9"
	)
	public Object method7414(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4482 != -1L) { // L: 56
				this.method7416();
			}

			class395 var3 = (class395)this.field4484.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7415(var3, false); // L: 59
				return var3.field4491; // L: 60
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-388203843"
	)
	public Object method7427(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4482 != -1L) { // L: 66
				this.method7416();
			}

			class395 var4 = (class395)this.field4484.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4491; // L: 69
				var4.field4491 = var2; // L: 70
				this.method7415(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class395 var5;
				if (this.method7421() && this.field4484.size() == this.field4485) { // L: 74
					var5 = (class395)this.field4481.remove(); // L: 75
					this.field4484.remove(var5.field4489); // L: 76
					this.field4483.remove(var5); // L: 77
				}

				var5 = new class395(var2, var1); // L: 79
				this.field4484.put(var1, var5); // L: 80
				this.method7415(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpn;ZI)V",
		garbageValue = "-797803936"
	)
	void method7415(class395 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4483.remove(var1); // L: 89
			if (this.method7421() && !this.field4481.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4488 = System.currentTimeMillis(); // L: 94
		if (this.method7421()) { // L: 95
			switch(this.field4486.field4477) { // L: 96
			case 0:
				++var1.field4490; // L: 98
				break;
			case 1:
				var1.field4490 = var1.field4488; // L: 101
			}

			this.field4481.add(var1); // L: 104
		}

		this.field4483.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1617279865"
	)
	void method7416() {
		if (this.field4482 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4482; // L: 112

			while (!this.field4483.isEmpty()) { // L: 113
				class395 var3 = (class395)this.field4483.peek(); // L: 114
				if (var3.field4488 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4484.remove(var3.field4489); // L: 116
				this.field4483.remove(var3); // L: 117
				if (this.method7421()) { // L: 118
					this.field4481.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1379189598"
	)
	public void method7417() {
		synchronized(this) { // L: 125
			this.field4484.clear(); // L: 126
			this.field4483.clear(); // L: 127
			if (this.method7421()) {
				this.field4481.clear(); // L: 128
			}

		}
	} // L: 130
}
