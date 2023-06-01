import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public final class class411 {
	@ObfuscatedName("ay")
	final Comparator field4568;
	@ObfuscatedName("an")
	final Map field4567;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	final class390 field4571;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	final class390 field4569;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 4677403799171983193L
	)
	final long field4570;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	final class409 field4572;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1298753823
	)
	final int field4566;

	@ObfuscatedSignature(
		descriptor = "(JILpe;)V"
	)
	class411(long var1, int var3, class409 var4) {
		this.field4568 = new class410(this); // L: 7
		this.field4570 = var1; // L: 34
		this.field4566 = var3; // L: 35
		this.field4572 = var4; // L: 36
		if (this.field4566 == -1) { // L: 37
			this.field4567 = new HashMap(64); // L: 38
			this.field4571 = new class390(64, this.field4568); // L: 39
			this.field4569 = null; // L: 40
		} else {
			if (this.field4572 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4567 = new HashMap(this.field4566); // L: 44
			this.field4571 = new class390(this.field4566, this.field4568); // L: 45
			this.field4569 = new class390(this.field4566); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILpe;)V"
	)
	public class411(int var1, class409 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "117"
	)
	boolean method7697() {
		return this.field4566 != -1; // L: 51
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1195466288"
	)
	public Object method7684(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4570) { // L: 56
				this.method7693();
			}

			class412 var3 = (class412)this.field4567.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7687(var3, false); // L: 59
				return var3.field4575; // L: 60
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1525405475"
	)
	public Object method7686(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4570) { // L: 66
				this.method7693();
			}

			class412 var4 = (class412)this.field4567.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4575; // L: 69
				var4.field4575 = var2; // L: 70
				this.method7687(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class412 var5;
				if (this.method7697() && this.field4567.size() == this.field4566) { // L: 74
					var5 = (class412)this.field4569.remove(); // L: 75
					this.field4567.remove(var5.field4574); // L: 76
					this.field4571.remove(var5); // L: 77
				}

				var5 = new class412(var2, var1); // L: 79
				this.field4567.put(var1, var5); // L: 80
				this.method7687(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lps;ZI)V",
		garbageValue = "-1601432701"
	)
	void method7687(class412 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4571.remove(var1); // L: 89
			if (this.method7697() && !this.field4569.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4573 = System.currentTimeMillis(); // L: 94
		if (this.method7697()) { // L: 95
			switch(this.field4572.field4560) { // L: 96
			case 0:
				var1.field4576 = var1.field4573; // L: 98
				break;
			case 1:
				++var1.field4576; // L: 101
			}

			this.field4569.add(var1); // L: 104
		}

		this.field4571.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-60077347"
	)
	void method7693() {
		if (this.field4570 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4570; // L: 112

			while (!this.field4571.isEmpty()) { // L: 113
				class412 var3 = (class412)this.field4571.peek(); // L: 114
				if (var3.field4573 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4567.remove(var3.field4574); // L: 116
				this.field4571.remove(var3); // L: 117
				if (this.method7697()) { // L: 118
					this.field4569.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-538184646"
	)
	public void method7689() {
		synchronized(this) { // L: 125
			this.field4567.clear(); // L: 126
			this.field4571.clear(); // L: 127
			if (this.method7697()) { // L: 128
				this.field4569.clear();
			}

		}
	} // L: 130
}
