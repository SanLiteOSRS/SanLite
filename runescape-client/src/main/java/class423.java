import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public final class class423 {
	@ObfuscatedName("ai")
	final Comparator field4600;
	@ObfuscatedName("aj")
	final Map field4594;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	final class392 field4598;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	final class392 field4596;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 3738894269644779697L
	)
	final long field4597;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	final class421 field4595;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 943114741
	)
	final int field4599;

	@ObfuscatedSignature(
		descriptor = "(JILqv;)V"
	)
	class423(long var1, int var3, class421 var4) {
		this.field4600 = new class422(this); // L: 7
		this.field4597 = var1; // L: 34
		this.field4599 = var3; // L: 35
		this.field4595 = var4; // L: 36
		if (this.field4599 == -1) { // L: 37
			this.field4594 = new HashMap(64); // L: 38
			this.field4598 = new class392(64, this.field4600); // L: 39
			this.field4596 = null; // L: 40
		} else {
			if (this.field4595 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4594 = new HashMap(this.field4599); // L: 44
			this.field4598 = new class392(this.field4599, this.field4600); // L: 45
			this.field4596 = new class392(this.field4599); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqv;)V"
	)
	public class423(int var1, class421 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "25539163"
	)
	boolean method7804() {
		return this.field4599 != -1; // L: 51
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-39"
	)
	public Object method7818(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4597 != -1L) { // L: 56
				this.method7813();
			}

			class424 var3 = (class424)this.field4594.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7806(var3, false); // L: 59
				return var3.field4602; // L: 60
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1638359933"
	)
	public Object method7805(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4597) { // L: 66
				this.method7813();
			}

			class424 var4 = (class424)this.field4594.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4602; // L: 69
				var4.field4602 = var2; // L: 70
				this.method7806(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class424 var5;
				if (this.method7804() && this.field4594.size() == this.field4599) { // L: 74
					var5 = (class424)this.field4596.remove(); // L: 75
					this.field4594.remove(var5.field4604); // L: 76
					this.field4598.remove(var5); // L: 77
				}

				var5 = new class424(var2, var1); // L: 79
				this.field4594.put(var1, var5); // L: 80
				this.method7806(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqu;ZI)V",
		garbageValue = "1883173563"
	)
	void method7806(class424 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4598.remove(var1); // L: 89
			if (this.method7804() && !this.field4596.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4603 = System.currentTimeMillis(); // L: 94
		if (this.method7804()) { // L: 95
			switch(this.field4595.field4587) { // L: 96
			case 0:
				++var1.field4605; // L: 101
				break;
			case 1:
				var1.field4605 = var1.field4603; // L: 98
			}

			this.field4596.add(var1); // L: 104
		}

		this.field4598.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-823667197"
	)
	void method7813() {
		if (-1L == this.field4597) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4597; // L: 112

			while (!this.field4598.isEmpty()) { // L: 113
				class424 var3 = (class424)this.field4598.peek(); // L: 114
				if (var3.field4603 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4594.remove(var3.field4604); // L: 116
				this.field4598.remove(var3); // L: 117
				if (this.method7804()) { // L: 118
					this.field4596.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-393981495"
	)
	public void method7808() {
		synchronized(this) { // L: 125
			this.field4594.clear(); // L: 126
			this.field4598.clear(); // L: 127
			if (this.method7804()) { // L: 128
				this.field4596.clear();
			}

		}
	} // L: 130
}
