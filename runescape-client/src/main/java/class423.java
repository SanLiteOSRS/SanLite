import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public final class class423 {
	@ObfuscatedName("au")
	final Comparator field4619;
	@ObfuscatedName("ae")
	final Map field4613;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	final class392 field4614;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	final class392 field4615;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 1657733685024468239L
	)
	final long field4616;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	final class421 field4617;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -139737171
	)
	final int field4618;

	@ObfuscatedSignature(
		descriptor = "(JILqm;)V"
	)
	class423(long var1, int var3, class421 var4) {
		this.field4619 = new class422(this); // L: 7
		this.field4616 = var1; // L: 34
		this.field4618 = var3; // L: 35
		this.field4617 = var4; // L: 36
		if (this.field4618 == -1) { // L: 37
			this.field4613 = new HashMap(64); // L: 38
			this.field4614 = new class392(64, this.field4619); // L: 39
			this.field4615 = null; // L: 40
		} else {
			if (this.field4617 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4613 = new HashMap(this.field4618); // L: 44
			this.field4614 = new class392(this.field4618, this.field4619); // L: 45
			this.field4615 = new class392(this.field4618); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqm;)V"
	)
	public class423(int var1, class421 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1594986015"
	)
	boolean method7780() {
		return this.field4618 != -1; // L: 51
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-31"
	)
	public Object method7781(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4616 != -1L) { // L: 56
				this.method7783();
			}

			class424 var3 = (class424)this.field4613.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7784(var3, false); // L: 59
				return var3.field4620; // L: 60
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-396691149"
	)
	public Object method7782(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4616 != -1L) { // L: 66
				this.method7783();
			}

			class424 var4 = (class424)this.field4613.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4620; // L: 69
				var4.field4620 = var2; // L: 70
				this.method7784(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class424 var5;
				if (this.method7780() && this.field4613.size() == this.field4618) { // L: 74
					var5 = (class424)this.field4615.remove(); // L: 75
					this.field4613.remove(var5.field4621); // L: 76
					this.field4614.remove(var5); // L: 77
				}

				var5 = new class424(var2, var1); // L: 79
				this.field4613.put(var1, var5); // L: 80
				this.method7784(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqj;ZB)V",
		garbageValue = "16"
	)
	void method7784(class424 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4614.remove(var1); // L: 89
			if (this.method7780() && !this.field4615.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4622 = System.currentTimeMillis(); // L: 94
		if (this.method7780()) { // L: 95
			switch(this.field4617.field4607) { // L: 96
			case 0:
				var1.field4623 = var1.field4622; // L: 98
				break;
			case 1:
				++var1.field4623; // L: 101
			}

			this.field4615.add(var1); // L: 104
		}

		this.field4614.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1791287945"
	)
	void method7783() {
		if (this.field4616 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4616; // L: 112

			while (!this.field4614.isEmpty()) { // L: 113
				class424 var3 = (class424)this.field4614.peek(); // L: 114
				if (var3.field4622 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4613.remove(var3.field4621); // L: 116
				this.field4614.remove(var3); // L: 117
				if (this.method7780()) { // L: 118
					this.field4615.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	public void method7779() {
		synchronized(this) { // L: 125
			this.field4613.clear(); // L: 126
			this.field4614.clear(); // L: 127
			if (this.method7780()) {
				this.field4615.clear(); // L: 128
			}

		}
	} // L: 130
}
