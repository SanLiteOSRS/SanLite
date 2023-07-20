import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public final class class424 {
	@ObfuscatedName("ak")
	static String field4617;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -245464635
	)
	static int field4622;
	@ObfuscatedName("aw")
	final Comparator field4614;
	@ObfuscatedName("ay")
	final Map field4618;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	final class393 field4616;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	final class393 field4615;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 3780324665088720995L
	)
	final long field4621;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	final class422 field4619;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2116285329
	)
	final int field4620;

	@ObfuscatedSignature(
		descriptor = "(JILqu;)V"
	)
	class424(long var1, int var3, class422 var4) {
		this.field4614 = new class423(this); // L: 7
		this.field4621 = var1; // L: 34
		this.field4620 = var3; // L: 35
		this.field4619 = var4; // L: 36
		if (this.field4620 == -1) { // L: 37
			this.field4618 = new HashMap(64); // L: 38
			this.field4616 = new class393(64, this.field4614); // L: 39
			this.field4615 = null; // L: 40
		} else {
			if (this.field4619 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4618 = new HashMap(this.field4620); // L: 44
			this.field4616 = new class393(this.field4620, this.field4614); // L: 45
			this.field4615 = new class393(this.field4620); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqu;)V"
	)
	public class424(int var1, class422 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-61352900"
	)
	boolean method7828() {
		return this.field4620 != -1; // L: 51
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "2120370610"
	)
	public Object method7829(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4621) { // L: 56
				this.method7832();
			}

			class425 var3 = (class425)this.field4618.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7831(var3, false); // L: 59
				return var3.field4624; // L: 60
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "301709804"
	)
	public Object method7830(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4621) { // L: 66
				this.method7832();
			}

			class425 var4 = (class425)this.field4618.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4624; // L: 69
				var4.field4624 = var2; // L: 70
				this.method7831(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class425 var5;
				if (this.method7828() && this.field4618.size() == this.field4620) { // L: 74
					var5 = (class425)this.field4615.remove(); // L: 75
					this.field4618.remove(var5.field4626); // L: 76
					this.field4616.remove(var5); // L: 77
				}

				var5 = new class425(var2, var1); // L: 79
				this.field4618.put(var1, var5); // L: 80
				this.method7831(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqr;ZI)V",
		garbageValue = "-113992548"
	)
	void method7831(class425 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4616.remove(var1); // L: 89
			if (this.method7828() && !this.field4615.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4625 = System.currentTimeMillis(); // L: 94
		if (this.method7828()) { // L: 95
			switch(this.field4619.field4611) { // L: 96
			case 0:
				++var1.field4623; // L: 101
				break;
			case 1:
				var1.field4623 = var1.field4625; // L: 98
			}

			this.field4615.add(var1); // L: 104
		}

		this.field4616.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	void method7832() {
		if (-1L == this.field4621) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4621; // L: 112

			while (!this.field4616.isEmpty()) { // L: 113
				class425 var3 = (class425)this.field4616.peek(); // L: 114
				if (var3.field4625 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4618.remove(var3.field4626); // L: 116
				this.field4616.remove(var3); // L: 117
				if (this.method7828()) { // L: 118
					this.field4615.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134542094"
	)
	public void method7849() {
		synchronized(this) { // L: 125
			this.field4618.clear(); // L: 126
			this.field4616.clear(); // L: 127
			if (this.method7828()) {
				this.field4615.clear(); // L: 128
			}

		}
	} // L: 130

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltu;",
		garbageValue = "78"
	)
	public static class508 method7827(int var0) {
		class508 var1 = (class508)class508.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class508.field5052.takeFile(38, var0); // L: 26
			var1 = new class508(); // L: 27
			if (var2 != null) { // L: 28
				var1.method8995(new Buffer(var2));
			}

			var1.method9008(); // L: 29
			class508.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
