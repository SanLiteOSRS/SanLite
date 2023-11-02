import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class176, MouseWheelListener {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -857622107
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0; // L: 8
	} // L: 10

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1378624213"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this); // L: 13
	} // L: 14

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-65029558"
	)
	void method301(Component var1) {
		var1.removeMouseWheelListener(this); // L: 17
	} // L: 18

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1993578896"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation; // L: 26
		this.rotation = 0; // L: 27
		return var1; // L: 28
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation(); // L: 22
	} // L: 23
}
