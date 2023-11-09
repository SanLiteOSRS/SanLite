import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("Task")
public class Task {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ab")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -158023659
	)
	@Export("type")
	int type;
	@ObfuscatedName("ax")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("al")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("aj")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 10
	} // L: 22
}
