import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class11 {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1120032749
	)
	static int field112;
	@ObfuscatedName("c")
	boolean field87;
	@ObfuscatedName("o")
	boolean field88;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 3282705810889251661L
	)
	long field103;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1207277285
	)
	int field90;
	@ObfuscatedName("z")
	public String field91;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -87337933
	)
	int field92;
	@ObfuscatedName("v")
	public boolean field93;
	@ObfuscatedName("b")
	public byte field111;
	@ObfuscatedName("q")
	public byte field95;
	@ObfuscatedName("i")
	public byte field96;
	@ObfuscatedName("x")
	public byte field113;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2021066881
	)
	public int field98;
	@ObfuscatedName("r")
	long[] field97;
	@ObfuscatedName("p")
	public byte[] field100;
	@ObfuscatedName("a")
	int[] field99;
	@ObfuscatedName("e")
	int[] field102;
	@ObfuscatedName("d")
	public int[] field94;
	@ObfuscatedName("u")
	public boolean[] field104;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1715642763
	)
	public int field105;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -267718841
	)
	public int field106;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1432203507
	)
	public int field107;
	@ObfuscatedName("s")
	long[] field108;
	@ObfuscatedName("y")
	public String[] field109;
	@ObfuscatedName("w")
	public String[] field101;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	IterableNodeHashTable field89;

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class11(Buffer var1) {
		this.field90 = 0;
		this.field91 = null;
		this.field92 = 0;
		this.field105 = -1;
		this.field106 = -1;
		this.method135(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "241489233"
	)
	void method111(int var1) {
		if (this.field87) {
			if (this.field97 != null) {
				System.arraycopy(this.field97, 0, this.field97 = new long[var1], 0, this.field98);
			} else {
				this.field97 = new long[var1];
			}
		}

		if (this.field88) {
			if (this.field109 != null) {
				System.arraycopy(this.field109, 0, this.field109 = new String[var1], 0, this.field98);
			} else {
				this.field109 = new String[var1];
			}
		}

		if (this.field100 != null) {
			System.arraycopy(this.field100, 0, this.field100 = new byte[var1], 0, this.field98);
		} else {
			this.field100 = new byte[var1];
		}

		if (this.field102 != null) {
			System.arraycopy(this.field102, 0, this.field102 = new int[var1], 0, this.field98);
		} else {
			this.field102 = new int[var1];
		}

		if (this.field94 != null) {
			System.arraycopy(this.field94, 0, this.field94 = new int[var1], 0, this.field98);
		} else {
			this.field94 = new int[var1];
		}

		if (this.field104 != null) {
			System.arraycopy(this.field104, 0, this.field104 = new boolean[var1], 0, this.field98);
		} else {
			this.field104 = new boolean[var1];
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "66"
	)
	void method112(int var1) {
		if (this.field87) {
			if (this.field108 != null) {
				System.arraycopy(this.field108, 0, this.field108 = new long[var1], 0, this.field107);
			} else {
				this.field108 = new long[var1];
			}
		}

		if (this.field88) {
			if (this.field101 != null) {
				System.arraycopy(this.field101, 0, this.field101 = new String[var1], 0, this.field107);
			} else {
				this.field101 = new String[var1];
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "657242111"
	)
	public int method113(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.field98; ++var2) {
				if (this.field109[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-267718841"
	)
	public int method114(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field102[var1] & var4) >>> var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1499544998"
	)
	public Integer method152(int var1) {
		if (this.field89 == null) {
			return null;
		} else {
			Node var2 = this.field89.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1864900948"
	)
	public int[] method167() {
		if (this.field99 == null) {
			String[] var1 = new String[this.field98];
			this.field99 = new int[this.field98];

			for (int var2 = 0; var2 < this.field98; this.field99[var2] = var2++) {
				var1[var2] = this.field109[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.field99;
			class124.method2500(var1, var3, 0, var1.length - 1);
		}

		return this.field99;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "61"
	)
	void method117(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.field87 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.field88 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field97 == null || this.field98 >= this.field97.length) || var3 != null && (this.field109 == null || this.field98 >= this.field109.length)) {
				this.method111(this.field98 + 5);
			}

			if (this.field97 != null) {
				this.field97[this.field98] = var1;
			}

			if (this.field109 != null) {
				this.field109[this.field98] = var3;
			}

			if (this.field105 == -1) {
				this.field105 = this.field98;
				this.field100[this.field98] = 126;
			} else {
				this.field100[this.field98] = 0;
			}

			this.field102[this.field98] = 0;
			this.field94[this.field98] = var4;
			this.field104[this.field98] = false;
			++this.field98;
			this.field99 = null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1122092464"
	)
	void method157(int var1) {
		if (var1 >= 0 && var1 < this.field98) {
			--this.field98;
			this.field99 = null;
			if (this.field98 == 0) {
				this.field97 = null;
				this.field109 = null;
				this.field100 = null;
				this.field102 = null;
				this.field94 = null;
				this.field104 = null;
				this.field105 = -1;
				this.field106 = -1;
			} else {
				System.arraycopy(this.field100, var1 + 1, this.field100, var1, this.field98 - var1);
				System.arraycopy(this.field102, var1 + 1, this.field102, var1, this.field98 - var1);
				System.arraycopy(this.field94, var1 + 1, this.field94, var1, this.field98 - var1);
				System.arraycopy(this.field104, var1 + 1, this.field104, var1, this.field98 - var1);
				if (this.field97 != null) {
					System.arraycopy(this.field97, var1 + 1, this.field97, var1, this.field98 - var1);
				}

				if (this.field109 != null) {
					System.arraycopy(this.field109, var1 + 1, this.field109, var1, this.field98 - var1);
				}

				this.method119();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-31"
	)
	void method119() {
		if (this.field98 == 0) {
			this.field105 = -1;
			this.field106 = -1;
		} else {
			this.field105 = -1;
			this.field106 = -1;
			int var1 = 0;
			byte var2 = this.field100[0];

			for (int var3 = 1; var3 < this.field98; ++var3) {
				if (this.field100[var3] > var2) {
					if (var2 == 125) {
						this.field106 = var1;
					}

					var1 = var3;
					var2 = this.field100[var3];
				} else if (this.field106 == -1 && this.field100[var3] == 125) {
					this.field106 = var3;
				}
			}

			this.field105 = var1;
			if (this.field105 != -1) {
				this.field100[this.field105] = 126;
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "63"
	)
	void method120(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.field87 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field88) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field108 == null || this.field107 >= this.field108.length) || var3 != null && (this.field101 == null || this.field107 >= this.field101.length)) {
				this.method112(this.field107 + 5);
			}

			if (this.field108 != null) {
				this.field108[this.field107] = var1;
			}

			if (this.field101 != null) {
				this.field101[this.field107] = var3;
			}

			++this.field107;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1819056375"
	)
	void method121(int var1) {
		--this.field107;
		if (this.field107 == 0) {
			this.field108 = null;
			this.field101 = null;
		} else {
			if (this.field108 != null) {
				System.arraycopy(this.field108, var1 + 1, this.field108, var1, this.field107 - var1);
			}

			if (this.field101 != null) {
				System.arraycopy(this.field101, var1 + 1, this.field101, var1, this.field107 - var1);
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "1047518039"
	)
	int method191(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.field105 == var1 && (this.field106 == -1 || this.field100[this.field106] < 125)) {
				return -1;
			} else if (this.field100[var1] == var2) {
				return -1;
			} else {
				this.field100[var1] = var2;
				this.method119();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1333266442"
	)
	boolean method123(int var1) {
		if (this.field105 != var1 && this.field100[var1] != 126) {
			this.field100[this.field105] = 125;
			this.field106 = this.field105;
			this.field100[var1] = 126;
			this.field105 = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1187592850"
	)
	int method133(int var1, boolean var2) {
		if (this.field104[var1] == var2) {
			return -1;
		} else {
			this.field104[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1968754064"
	)
	int method156(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field102[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field102[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1937890199"
	)
	boolean method126(int var1, int var2) {
		if (this.field89 != null) {
			Node var3 = this.field89.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
					if (var2 == var4.integer) {
						return false;
					}

					var4.integer = var2;
					return true;
				}

				var3.remove();
			}
		} else {
			this.field89 = new IterableNodeHashTable(4);
		}

		this.field89.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1701986674"
	)
	boolean method127(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.field89 != null) {
			Node var8 = this.field89.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
					if ((var9.integer & var7) == var2) {
						return false;
					}

					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}

				var8.remove();
			}
		} else {
			this.field89 = new IterableNodeHashTable(4);
		}

		this.field89.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("d")
	boolean method128(int var1, long var2) {
		if (this.field89 != null) {
			Node var4 = this.field89.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class349) {
					class349 var5 = (class349)var4;
					if (var5.field3945 == var2) {
						return false;
					}

					var5.field3945 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.field89 = new IterableNodeHashTable(4);
		}

		this.field89.put(new class349(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Z",
		garbageValue = "1"
	)
	boolean method131(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.field89 != null) {
			Node var3 = this.field89.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove();
						this.field89.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.field89 = new IterableNodeHashTable(4);
		}

		this.field89.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-1322806444"
	)
	void method135(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.field87 = true;
			}

			if ((var3 & 2) != 0) {
				this.field88 = true;
			}

			if (!this.field87) {
				this.field97 = null;
				this.field108 = null;
			}

			if (!this.field88) {
				this.field109 = null;
				this.field101 = null;
			}

			this.field90 = var1.readInt();
			this.field92 = var1.readInt();
			if (var2 <= 3 && this.field92 != 0) {
				this.field92 += 16912800;
			}

			this.field98 = var1.readUnsignedShort();
			this.field107 = var1.readUnsignedByte();
			this.field91 = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.field93 = var1.readUnsignedByte() == 1;
			this.field111 = var1.readByte();
			this.field95 = var1.readByte();
			this.field96 = var1.readByte();
			this.field113 = var1.readByte();
			int var4;
			if (this.field98 > 0) {
				if (this.field87 && (this.field97 == null || this.field97.length < this.field98)) {
					this.field97 = new long[this.field98];
				}

				if (this.field88 && (this.field109 == null || this.field109.length < this.field98)) {
					this.field109 = new String[this.field98];
				}

				if (this.field100 == null || this.field100.length < this.field98) {
					this.field100 = new byte[this.field98];
				}

				if (this.field102 == null || this.field102.length < this.field98) {
					this.field102 = new int[this.field98];
				}

				if (this.field94 == null || this.field94.length < this.field98) {
					this.field94 = new int[this.field98];
				}

				if (this.field104 == null || this.field104.length < this.field98) {
					this.field104 = new boolean[this.field98];
				}

				for (var4 = 0; var4 < this.field98; ++var4) {
					if (this.field87) {
						this.field97[var4] = var1.readLong();
					}

					if (this.field88) {
						this.field109[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.field100[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field102[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field94[var4] = var1.readUnsignedShort();
					} else {
						this.field94[var4] = 0;
					}

					if (var2 >= 6) {
						this.field104[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field104[var4] = false;
					}
				}

				this.method119();
			}

			if (this.field107 > 0) {
				if (this.field87 && (this.field108 == null || this.field108.length < this.field107)) {
					this.field108 = new long[this.field107];
				}

				if (this.field88 && (this.field101 == null || this.field101.length < this.field107)) {
					this.field101 = new String[this.field107];
				}

				for (var4 = 0; var4 < this.field107; ++var4) {
					if (this.field87) {
						this.field108[var4] = var1.readLong();
					}

					if (this.field88) {
						this.field101[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					this.field89 = new IterableNodeHashTable(var4 < 16 ? MouseRecorder.method2126(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.field89.put(new IntegerNode(var12), (long)var6);
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.field89.put(new class349(var10), (long)var6);
						} else if (var7 == 2) {
							String var8 = var1.readStringCp1252NullTerminated();
							this.field89.put(new ObjectNode(var8), (long)var6);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1465463925"
	)
	static final boolean method190() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Liv;B)Z",
		garbageValue = "117"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
