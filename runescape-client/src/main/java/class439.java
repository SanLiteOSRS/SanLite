import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class439 {
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -1723638141
	)
	static int field4690;
	@ObfuscatedName("am")
	final Comparator field4686;
	@ObfuscatedName("ap")
	final Map field4683;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class408 field4687;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class408 field4689;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3213162539382768437L
	)
	final long field4684;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	final class437 field4685;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1679721967
	)
	final int field4688;

	@ObfuscatedSignature(
		descriptor = "(JILqu;)V"
	)
	class439(long var1, int var3, class437 var4) {
		this.field4686 = new class438(this); // L: 7
		this.field4684 = var1; // L: 34
		this.field4688 = var3; // L: 35
		this.field4685 = var4; // L: 36
		if (this.field4688 == -1) { // L: 37
			this.field4683 = new HashMap(64); // L: 38
			this.field4687 = new class408(64, this.field4686); // L: 39
			this.field4689 = null; // L: 40
		} else {
			if (this.field4685 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4683 = new HashMap(this.field4688); // L: 44
			this.field4687 = new class408(this.field4688, this.field4686); // L: 45
			this.field4689 = new class408(this.field4688); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqu;)V"
	)
	public class439(int var1, class437 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "241187348"
	)
	boolean method8144() {
		return this.field4688 != -1; // L: 51
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-37"
	)
	public Object method8139(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4684 != -1L) { // L: 56
				this.method8142();
			}

			class440 var3 = (class440)this.field4683.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method8141(var3, false); // L: 59
				return var3.field4693; // L: 60
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-959045434"
	)
	public Object method8146(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4684) { // L: 66
				this.method8142();
			}

			class440 var4 = (class440)this.field4683.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4693; // L: 69
				var4.field4693 = var2; // L: 70
				this.method8141(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class440 var5;
				if (this.method8144() && this.field4683.size() == this.field4688) { // L: 74
					var5 = (class440)this.field4689.remove(); // L: 75
					this.field4683.remove(var5.field4692); // L: 76
					this.field4687.remove(var5); // L: 77
				}

				var5 = new class440(var2, var1); // L: 79
				this.field4683.put(var1, var5); // L: 80
				this.method8141(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqm;ZB)V",
		garbageValue = "-85"
	)
	void method8141(class440 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4687.remove(var1); // L: 89
			if (this.method8144() && !this.field4689.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4694 = System.currentTimeMillis(); // L: 94
		if (this.method8144()) { // L: 95
			switch(this.field4685.field4679) { // L: 96
			case 0:
				++var1.field4691; // L: 98
				break;
			case 1:
				var1.field4691 = var1.field4694; // L: 101
			}

			this.field4689.add(var1); // L: 104
		}

		this.field4687.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2039841049"
	)
	void method8142() {
		if (this.field4684 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4684; // L: 112

			while (!this.field4687.isEmpty()) { // L: 113
				class440 var3 = (class440)this.field4687.peek(); // L: 114
				if (var3.field4694 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4683.remove(var3.field4692); // L: 116
				this.field4687.remove(var3); // L: 117
				if (this.method8144()) { // L: 118
					this.field4689.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-588866192"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) { // L: 125
			this.field4683.clear(); // L: 126
			this.field4687.clear(); // L: 127
			if (this.method8144()) { // L: 128
				this.field4689.clear();
			}

		}
	} // L: 130
}
