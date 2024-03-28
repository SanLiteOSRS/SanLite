import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public final class class443 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field4751;
	@ObfuscatedName("az")
	final Comparator field4753;
	@ObfuscatedName("ah")
	final Map field4758;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	final class412 field4752;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	final class412 field4754;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 7545653809512582065L
	)
	final long field4755;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	final class441 field4756;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 832179613
	)
	final int field4757;

	@ObfuscatedSignature(
		descriptor = "(JILqj;)V"
	)
	class443(long var1, int var3, class441 var4) {
		this.field4753 = new class442(this); // L: 7
		this.field4755 = var1; // L: 34
		this.field4757 = var3; // L: 35
		this.field4756 = var4; // L: 36
		if (this.field4757 == -1) { // L: 37
			this.field4758 = new HashMap(64); // L: 38
			this.field4752 = new class412(64, this.field4753); // L: 39
			this.field4754 = null; // L: 40
		} else {
			if (this.field4756 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4758 = new HashMap(this.field4757); // L: 44
			this.field4752 = new class412(this.field4757, this.field4753); // L: 45
			this.field4754 = new class412(this.field4757); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILqj;)V"
	)
	public class443(int var1, class441 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1689132783"
	)
	boolean method8007() {
		return this.field4757 != -1; // L: 51
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "2106112126"
	)
	public Object method8015(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4755 != -1L) { // L: 56
				this.method8010();
			}

			class444 var3 = (class444)this.field4758.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method8014(var3, false); // L: 59
				return var3.field4762; // L: 60
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "460192275"
	)
	public Object method8008(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4755) { // L: 66
				this.method8010();
			}

			class444 var4 = (class444)this.field4758.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4762; // L: 69
				var4.field4762 = var2; // L: 70
				this.method8014(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class444 var5;
				if (this.method8007() && this.field4758.size() == this.field4757) { // L: 74
					var5 = (class444)this.field4754.remove(); // L: 75
					this.field4758.remove(var5.field4761); // L: 76
					this.field4752.remove(var5); // L: 77
				}

				var5 = new class444(var2, var1); // L: 79
				this.field4758.put(var1, var5); // L: 80
				this.method8014(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrv;ZI)V",
		garbageValue = "2043331255"
	)
	void method8014(class444 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4752.remove(var1); // L: 89
			if (this.method8007() && !this.field4754.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4760 = System.currentTimeMillis(); // L: 94
		if (this.method8007()) { // L: 95
			switch(this.field4756.field4747) { // L: 96
			case 0:
				++var1.field4763; // L: 101
				break;
			case 1:
				var1.field4763 = var1.field4760; // L: 98
			}

			this.field4754.add(var1); // L: 104
		}

		this.field4752.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1383267868"
	)
	void method8010() {
		if (this.field4755 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4755; // L: 112

			while (!this.field4752.isEmpty()) { // L: 113
				class444 var3 = (class444)this.field4752.peek(); // L: 114
				if (var3.field4760 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4758.remove(var3.field4761); // L: 116
				this.field4752.remove(var3); // L: 117
				if (this.method8007()) { // L: 118
					this.field4754.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	public void method8011() {
		synchronized(this) { // L: 125
			this.field4758.clear(); // L: 126
			this.field4752.clear(); // L: 127
			if (this.method8007()) { // L: 128
				this.field4754.clear();
			}

		}
	} // L: 130
}
