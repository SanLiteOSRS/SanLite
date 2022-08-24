import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public final class class362 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1329008803
	)
	static int field4262;
	@ObfuscatedName("s")
	final Comparator field4268;
	@ObfuscatedName("h")
	final Map field4261;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	final class348 field4264;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	final class348 field4263;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -4423586593673882757L
	)
	final long field4260;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final class360 field4265;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -635055347
	)
	final int field4266;

	@ObfuscatedSignature(
		descriptor = "(JILmc;)V"
	)
	class362(long var1, int var3, class360 var4) {
		this.field4268 = new class361(this); // L: 7
		this.field4260 = var1; // L: 34
		this.field4266 = var3; // L: 35
		this.field4265 = var4; // L: 36
		if (this.field4266 == -1) { // L: 37
			this.field4261 = new HashMap(64); // L: 38
			this.field4264 = new class348(64, this.field4268); // L: 39
			this.field4263 = null; // L: 40
		} else {
			if (this.field4265 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4261 = new HashMap(this.field4266); // L: 44
			this.field4264 = new class348(this.field4266, this.field4268); // L: 45
			this.field4263 = new class348(this.field4266); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILmc;)V"
	)
	public class362(int var1, class360 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-43"
	)
	boolean method6497() {
		return this.field4266 != -1; // L: 51
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1536391556"
	)
	public Object method6498(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4260 != -1L) { // L: 56
				this.method6508();
			}

			class363 var3 = (class363)this.field4261.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method6500(var3, false); // L: 59
				return var3.field4272; // L: 60
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1899439208"
	)
	public Object method6499(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4260 != -1L) { // L: 66
				this.method6508();
			}

			class363 var4 = (class363)this.field4261.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4272; // L: 69
				var4.field4272 = var2; // L: 70
				this.method6500(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class363 var5;
				if (this.method6497() && this.field4261.size() == this.field4266) { // L: 74
					var5 = (class363)this.field4263.remove(); // L: 75
					this.field4261.remove(var5.field4271); // L: 76
					this.field4264.remove(var5); // L: 77
				}

				var5 = new class363(var2, var1); // L: 79
				this.field4261.put(var1, var5); // L: 80
				this.method6500(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lmi;ZB)V",
		garbageValue = "120"
	)
	void method6500(class363 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4264.remove(var1); // L: 89
			if (this.method6497() && !this.field4263.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4270 = System.currentTimeMillis(); // L: 94
		if (this.method6497()) { // L: 95
			switch(this.field4265.field4258) { // L: 96
			case 0:
				var1.field4273 = var1.field4270; // L: 101
				break;
			case 1:
				++var1.field4273; // L: 98
			}

			this.field4263.add(var1); // L: 104
		}

		this.field4264.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "294917768"
	)
	void method6508() {
		if (-1L == this.field4260) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4260; // L: 112

			while (!this.field4264.isEmpty()) { // L: 113
				class363 var3 = (class363)this.field4264.peek(); // L: 114
				if (var3.field4270 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4261.remove(var3.field4271); // L: 116
				this.field4264.remove(var3); // L: 117
				if (this.method6497()) { // L: 118
					this.field4263.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lls;II)Lqe;",
		garbageValue = "-988398484"
	)
	public static IndexedSprite method6511(AbstractArchive var0, int var1) {
		return !ArchiveDiskActionHandler.method5708(var0, var1) ? null : Message.method1044(); // L: 187 188
	}
}
