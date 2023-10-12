import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -424258205
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 920024279
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -111949365
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1269252043
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIILih;B)Z",
		garbageValue = "0"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "517814479"
	)
	static String method4341() {
		StringBuilder var0 = new StringBuilder(); // L: 64

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 65 71
			var2 = (Message)var1.next(); // L: 66
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 68
				var0.append(var2.sender).append(':'); // L: 69
			}
		}

		return var0.toString(); // L: 74
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "972272925"
	)
	static final void method4340() {
		class436.method7914("You can't add yourself to your own ignore list"); // L: 156
	} // L: 157
}
