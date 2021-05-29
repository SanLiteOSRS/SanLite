import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class11 {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -1559836599
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("n")
	boolean field91;
	@ObfuscatedName("f")
	boolean field92;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 2571294659414795761L
	)
	long field109;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1000102115
	)
	int field94;
	@ObfuscatedName("j")
	public String field95;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2010490505
	)
	int field114;
	@ObfuscatedName("b")
	public boolean field97;
	@ObfuscatedName("d")
	public byte field103;
	@ObfuscatedName("s")
	public byte field113;
	@ObfuscatedName("u")
	public byte field98;
	@ObfuscatedName("l")
	public byte field96;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1916816431
	)
	public int field102;
	@ObfuscatedName("c")
	long[] field93;
	@ObfuscatedName("e")
	public byte[] field110;
	@ObfuscatedName("g")
	int[] field105;
	@ObfuscatedName("a")
	int[] field106;
	@ObfuscatedName("k")
	public int[] field101;
	@ObfuscatedName("m")
	public boolean[] field108;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1791364373
	)
	public int field100;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1909839147
	)
	public int field99;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1521260055
	)
	public int field111;
	@ObfuscatedName("t")
	long[] field112;
	@ObfuscatedName("h")
	public String[] field107;
	@ObfuscatedName("q")
	public String[] field90;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	IterableNodeHashTable field115;

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	public class11(Buffer var1) {
		this.field94 = 0;
		this.field95 = null;
		this.field114 = 0;
		this.field100 = -1;
		this.field99 = -1;
		this.method127(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1920986266"
	)
	void method97(int var1) {
		if (this.field91) {
			if (this.field93 != null) {
				System.arraycopy(this.field93, 0, this.field93 = new long[var1], 0, this.field102);
			} else {
				this.field93 = new long[var1];
			}
		}

		if (this.field92) {
			if (this.field107 != null) {
				System.arraycopy(this.field107, 0, this.field107 = new String[var1], 0, this.field102);
			} else {
				this.field107 = new String[var1];
			}
		}

		if (this.field110 != null) {
			System.arraycopy(this.field110, 0, this.field110 = new byte[var1], 0, this.field102);
		} else {
			this.field110 = new byte[var1];
		}

		if (this.field106 != null) {
			System.arraycopy(this.field106, 0, this.field106 = new int[var1], 0, this.field102);
		} else {
			this.field106 = new int[var1];
		}

		if (this.field101 != null) {
			System.arraycopy(this.field101, 0, this.field101 = new int[var1], 0, this.field102);
		} else {
			this.field101 = new int[var1];
		}

		if (this.field108 != null) {
			System.arraycopy(this.field108, 0, this.field108 = new boolean[var1], 0, this.field102);
		} else {
			this.field108 = new boolean[var1];
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method98(int var1) {
		if (this.field91) {
			if (this.field112 != null) {
				System.arraycopy(this.field112, 0, this.field112 = new long[var1], 0, this.field111);
			} else {
				this.field112 = new long[var1];
			}
		}

		if (this.field92) {
			if (this.field90 != null) {
				System.arraycopy(this.field90, 0, this.field90 = new String[var1], 0, this.field111);
			} else {
				this.field90 = new String[var1];
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "562871679"
	)
	public int method99(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.field102; ++var2) {
				if (this.field107[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1640558909"
	)
	public int method100(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field106[var1] & var4) >>> var2;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "5"
	)
	public Integer method101(int var1) {
		if (this.field115 == null) {
			return null;
		} else {
			Node var2 = this.field115.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1269043110"
	)
	public int[] method102() {
		if (this.field105 == null) {
			String[] var1 = new String[this.field102];
			this.field105 = new int[this.field102];

			for (int var2 = 0; var2 < this.field102; this.field105[var2] = var2++) {
				var1[var2] = this.field107[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			ChatChannel.method2013(var1, this.field105);
		}

		return this.field105;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "965862752"
	)
	void method103(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field91) {
			throw new RuntimeException("");
		} else if (this.field92 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field93 == null || this.field102 >= this.field93.length) || var3 != null && (this.field107 == null || this.field102 >= this.field107.length)) {
				this.method97(this.field102 + 5);
			}

			if (this.field93 != null) {
				this.field93[this.field102] = var1;
			}

			if (this.field107 != null) {
				this.field107[this.field102] = var3;
			}

			if (this.field100 == -1) {
				this.field100 = this.field102;
				this.field110[this.field102] = 126;
			} else {
				this.field110[this.field102] = 0;
			}

			this.field106[this.field102] = 0;
			this.field101[this.field102] = var4;
			this.field108[this.field102] = false;
			++this.field102;
			this.field105 = null;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-888167097"
	)
	void method121(int var1) {
		if (var1 >= 0 && var1 < this.field102) {
			--this.field102;
			this.field105 = null;
			if (this.field102 == 0) {
				this.field93 = null;
				this.field107 = null;
				this.field110 = null;
				this.field106 = null;
				this.field101 = null;
				this.field108 = null;
				this.field100 = -1;
				this.field99 = -1;
			} else {
				System.arraycopy(this.field110, var1 + 1, this.field110, var1, this.field102 - var1);
				System.arraycopy(this.field106, var1 + 1, this.field106, var1, this.field102 - var1);
				System.arraycopy(this.field101, var1 + 1, this.field101, var1, this.field102 - var1);
				System.arraycopy(this.field108, var1 + 1, this.field108, var1, this.field102 - var1);
				if (this.field93 != null) {
					System.arraycopy(this.field93, var1 + 1, this.field93, var1, this.field102 - var1);
				}

				if (this.field107 != null) {
					System.arraycopy(this.field107, var1 + 1, this.field107, var1, this.field102 - var1);
				}

				this.method105();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1130726760"
	)
	void method105() {
		if (this.field102 == 0) {
			this.field100 = -1;
			this.field99 = -1;
		} else {
			this.field100 = -1;
			this.field99 = -1;
			int var1 = 0;
			byte var2 = this.field110[0];

			for (int var3 = 1; var3 < this.field102; ++var3) {
				if (this.field110[var3] > var2) {
					if (var2 == 125) {
						this.field99 = var1;
					}

					var1 = var3;
					var2 = this.field110[var3];
				} else if (this.field99 == -1 && this.field110[var3] == 125) {
					this.field99 = var3;
				}
			}

			this.field100 = var1;
			if (this.field100 != -1) {
				this.field110[this.field100] = 126;
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "16"
	)
	void method106(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.field91 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.field92 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field112 == null || this.field111 >= this.field112.length) || var3 != null && (this.field90 == null || this.field111 >= this.field90.length)) {
				this.method98(this.field111 + 5);
			}

			if (this.field112 != null) {
				this.field112[this.field111] = var1;
			}

			if (this.field90 != null) {
				this.field90[this.field111] = var3;
			}

			++this.field111;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "618378761"
	)
	void method139(int var1) {
		--this.field111;
		if (this.field111 == 0) {
			this.field112 = null;
			this.field90 = null;
		} else {
			if (this.field112 != null) {
				System.arraycopy(this.field112, var1 + 1, this.field112, var1, this.field111 - var1);
			}

			if (this.field90 != null) {
				System.arraycopy(this.field90, var1 + 1, this.field90, var1, this.field111 - var1);
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IBB)I",
		garbageValue = "-45"
	)
	int method112(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.field100 == var1 && (this.field99 == -1 || this.field110[this.field99] < 125)) {
				return -1;
			} else if (this.field110[var1] == var2) {
				return -1;
			} else {
				this.field110[var1] = var2;
				this.method105();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-5"
	)
	boolean method109(int var1) {
		if (this.field100 != var1 && this.field110[var1] != 126) {
			this.field110[this.field100] = 125;
			this.field99 = this.field100;
			this.field110[var1] = 126;
			this.field100 = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "2"
	)
	int method110(int var1, boolean var2) {
		if (this.field108[var1] == var2) {
			return -1;
		} else {
			this.field108[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-2110063672"
	)
	int method126(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field106[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field106[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-677454143"
	)
	boolean method157(int var1, int var2) {
		if (this.field115 != null) {
			Node var3 = this.field115.get((long)var1);
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
			this.field115 = new IterableNodeHashTable(4);
		}

		this.field115.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1951488302"
	)
	boolean method113(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.field115 != null) {
			Node var8 = this.field115.get((long)var1);
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
			this.field115 = new IterableNodeHashTable(4);
		}

		this.field115.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("k")
	boolean method122(int var1, long var2) {
		if (this.field115 != null) {
			Node var4 = this.field115.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class349) {
					class349 var5 = (class349)var4;
					if (var5.field3935 == var2) {
						return false;
					}

					var5.field3935 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.field115 = new IterableNodeHashTable(4);
		}

		this.field115.put(new class349(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "1252307954"
	)
	boolean method115(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.field115 != null) {
			Node var3 = this.field115.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove();
						this.field115.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.field115 = new IterableNodeHashTable(4);
		}

		this.field115.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "469321554"
	)
	void method127(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.field91 = true;
			}

			if ((var3 & 2) != 0) {
				this.field92 = true;
			}

			if (!this.field91) {
				this.field93 = null;
				this.field112 = null;
			}

			if (!this.field92) {
				this.field107 = null;
				this.field90 = null;
			}

			this.field94 = var1.readInt();
			this.field114 = var1.readInt();
			if (var2 <= 3 && this.field114 != 0) {
				this.field114 += 16912800;
			}

			this.field102 = var1.readUnsignedShort();
			this.field111 = var1.readUnsignedByte();
			this.field95 = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.field97 = var1.readUnsignedByte() == 1;
			this.field103 = var1.readByte();
			this.field113 = var1.readByte();
			this.field98 = var1.readByte();
			this.field96 = var1.readByte();
			int var4;
			if (this.field102 > 0) {
				if (this.field91 && (this.field93 == null || this.field93.length < this.field102)) {
					this.field93 = new long[this.field102];
				}

				if (this.field92 && (this.field107 == null || this.field107.length < this.field102)) {
					this.field107 = new String[this.field102];
				}

				if (this.field110 == null || this.field110.length < this.field102) {
					this.field110 = new byte[this.field102];
				}

				if (this.field106 == null || this.field106.length < this.field102) {
					this.field106 = new int[this.field102];
				}

				if (this.field101 == null || this.field101.length < this.field102) {
					this.field101 = new int[this.field102];
				}

				if (this.field108 == null || this.field108.length < this.field102) {
					this.field108 = new boolean[this.field102];
				}

				for (var4 = 0; var4 < this.field102; ++var4) {
					if (this.field91) {
						this.field93[var4] = var1.readLong();
					}

					if (this.field92) {
						this.field107[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.field110[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field106[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field101[var4] = var1.readUnsignedShort();
					} else {
						this.field101[var4] = 0;
					}

					if (var2 >= 6) {
						this.field108[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field108[var4] = false;
					}
				}

				this.method105();
			}

			if (this.field111 > 0) {
				if (this.field91 && (this.field112 == null || this.field112.length < this.field111)) {
					this.field112 = new long[this.field111];
				}

				if (this.field92 && (this.field90 == null || this.field90.length < this.field111)) {
					this.field90 = new String[this.field111];
				}

				for (var4 = 0; var4 < this.field111; ++var4) {
					if (this.field91) {
						this.field112[var4] = var1.readLong();
					}

					if (this.field92) {
						this.field90[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					this.field115 = new IterableNodeHashTable(var4 < 16 ? Player.method2128(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.field115.put(new IntegerNode(var12), (long)var6);
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.field115.put(new class349(var10), (long)var6);
						} else if (var7 == 2) {
							String var8 = var1.readStringCp1252NullTerminated();
							this.field115.put(new ObjectNode(var8), (long)var6);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lex;",
		garbageValue = "760269699"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1049112805"
	)
	static final void method165() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var4 = Client.players[var0[var1]];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var2 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var2];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class22.Client_plane][var0][var1];
		if (var2 == null) {
			AbstractSocket.scene.removeGroundItemPile(class22.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = class260.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				AbstractSocket.scene.removeGroundItemPile(class22.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = DevicePcmPlayerProvider.calculateTag(var0, var1, 3, false, 0);
				AbstractSocket.scene.newGroundItemPile(class22.Client_plane, var0, var1, class105.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class22.Client_plane), var5, var9, var13, var8);
			}
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Lio;",
		garbageValue = "-778219160"
	)
	static Widget method125(Widget var0) {
		Widget var1 = StructComposition.method2892(var0);
		if (var1 == null) {
			var1 = var0.parent;
		}

		return var1;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-104"
	)
	static void method163(int var0) {
		Client.oculusOrbState = var0;
	}
}
