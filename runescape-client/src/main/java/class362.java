import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public final class class362 implements Comparable {
	@ObfuscatedName("v")
	Object field4221;
	@ObfuscatedName("c")
	Object field4224;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -5736347963697719881L
	)
	long field4222;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -1907411133840236385L
	)
	long field4223;

	class362(Object var1, Object var2) {
		this.field4221 = var1;
		this.field4224 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)I",
		garbageValue = "-368071179"
	)
	int method6615(class362 var1) {
		if (this.field4223 < var1.field4223) {
			return -1;
		} else {
			return this.field4223 > var1.field4223 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class362) {
			return this.field4224.equals(((class362)var1).field4224);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4224.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method6615((class362)var1);
	}
}
