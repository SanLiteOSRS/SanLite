import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;B)I",
		garbageValue = "4"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static void method2616() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "56"
	)
	static final void method2611(int var0, int var1) {
		if (Client.hintArrowType == 2) { // L: 4949
			Bounds.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - Decimator.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - class7.baseY * 64 << 7), Client.hintArrowHeight * 2); // L: 4950
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4951
				class229.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	} // L: 4952
}
