import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public final class class435 {
	@ObfuscatedName("at")
	final Comparator field4654;
	@ObfuscatedName("ah")
	final Map field4652;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	final class404 field4650;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	final class404 field4651;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 1971165188004438133L
	)
	final long field4649;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	final class433 field4653;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1741422329
	)
	final int field4648;

	@ObfuscatedSignature(
		descriptor = "(JILqm;)V"
	)
	class435(long var1, int var3, class433 var4) {
		this.field4654 = new class434(this); // L: 7
		this.field4649 = var1; // L: 34
		this.field4648 = var3; // L: 35
		this.field4653 = var4; // L: 36
		if (this.field4648 == -1) { // L: 37
			this.field4652 = new HashMap(64); // L: 38
			this.field4650 = new class404(64, this.field4654); // L: 39
			this.field4651 = null; // L: 40
		} else {
			if (this.field4653 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4652 = new HashMap(this.field4648); // L: 44
			this.field4650 = new class404(this.field4648, this.field4654); // L: 45
			this.field4651 = new class404(this.field4648); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqm;)V"
	)
	public class435(int var1, class433 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	boolean method8019() {
		return this.field4648 != -1; // L: 51
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "122"
	)
	public Object method8022(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4649) { // L: 56
				this.method8023();
			}

			class436 var3 = (class436)this.field4652.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method8031(var3, false); // L: 59
				return var3.field4655; // L: 60
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1227309321"
	)
	public Object method8037(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4649 != -1L) { // L: 66
				this.method8023();
			}

			class436 var4 = (class436)this.field4652.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4655; // L: 69
				var4.field4655 = var2; // L: 70
				this.method8031(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class436 var5;
				if (this.method8019() && this.field4652.size() == this.field4648) { // L: 74
					var5 = (class436)this.field4651.remove(); // L: 75
					this.field4652.remove(var5.field4658); // L: 76
					this.field4650.remove(var5); // L: 77
				}

				var5 = new class436(var2, var1); // L: 79
				this.field4652.put(var1, var5); // L: 80
				this.method8031(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqe;ZB)V",
		garbageValue = "14"
	)
	void method8031(class436 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4650.remove(var1); // L: 89
			if (this.method8019() && !this.field4651.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4657 = System.currentTimeMillis(); // L: 94
		if (this.method8019()) { // L: 95
			switch(this.field4653.field4643) { // L: 96
			case 0:
				++var1.field4656; // L: 98
				break;
			case 1:
				var1.field4656 = var1.field4657; // L: 101
			}

			this.field4651.add(var1); // L: 104
		}

		this.field4650.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-704318355"
	)
	void method8023() {
		if (this.field4649 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4649; // L: 112

			while (!this.field4650.isEmpty()) { // L: 113
				class436 var3 = (class436)this.field4650.peek(); // L: 114
				if (var3.field4657 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4652.remove(var3.field4658); // L: 116
				this.field4650.remove(var3); // L: 117
				if (this.method8019()) { // L: 118
					this.field4651.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-189414151"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) { // L: 125
			this.field4652.clear(); // L: 126
			this.field4650.clear(); // L: 127
			if (this.method8019()) { // L: 128
				this.field4651.clear();
			}

		}
	} // L: 130

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	static final void method8025() {
		if (Client.field601 != ItemLayer.Client_plane) { // L: 3810
			Client.field601 = ItemLayer.Client_plane; // L: 3811
			WorldMapDecoration.method4929(ItemLayer.Client_plane); // L: 3812
		}

	} // L: 3814
}
