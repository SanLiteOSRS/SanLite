import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class406 implements Iterator {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	class407 field4497;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -224368377
	)
	int field4496;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -187890627
	)
	int field4495;

	@ObfuscatedSignature(
		descriptor = "(Lpn;)V"
	)
	class406(class407 var1) {
		this.field4496 = 0; // L: 177
		this.field4495 = this.field4497.field4498; // L: 178
		this.field4497 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4496 < this.field4497.field4500; // L: 186
	}

	public Object next() {
		if (this.field4497.field4498 != this.field4495) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4496 < this.field4497.field4500) { // L: 193
			Object var1 = this.field4497.field4502[this.field4496].field4493; // L: 194
			++this.field4496; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lir;",
		garbageValue = "-1697714323"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lfs;",
		garbageValue = "2022917395"
	)
	static class133 method7419(int var0) {
		class133[] var1 = new class133[]{class133.field1571, class133.field1569, class133.field1563, class133.field1564, class133.field1565, class133.field1566}; // L: 33
		class133 var2 = (class133)SequenceDefinition.findEnumerated(var1, var0); // L: 35
		if (var2 == null) { // L: 36
			var2 = class133.field1571;
		}

		return var2; // L: 37
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lom;IB)Z",
		garbageValue = "1"
	)
	public static boolean method7415(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 170
		if (var2 == null) { // L: 171
			return false;
		} else {
			class164.SpriteBuffer_decode(var2); // L: 172
			return true; // L: 173
		}
	}
}
